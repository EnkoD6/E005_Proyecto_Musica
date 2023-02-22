package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.modelo.dto.Usuario;

public class DB_Helper implements DAO_constantes, DAO_metodos {

	
	
	@Override
	public Connection conectar() {

		Connection con= null;
		
		try {
			Class.forName(DRIVER);
			con= DriverManager.getConnection(RUTA, USUARIO, PASS);
			System.out.println("CONEXION OK");
		} catch (ClassNotFoundException e) {
			System.out.println("NO HAY DRIVER");
		} catch (SQLException e) {
			System.out.println("NO SE PUDO CONECTAR");
		}
		
		return con;
	}

	@Override
	public int desconectar(Connection con) {

		// si es 0, se desconecto OK
		// si es -1 error
		try {
			con.close();
			System.out.println("CONEXION CERRADA");
			return 0;
		} catch (SQLException e) {
			System.out.println("ERROR AL CERRAR");
			return -1;
		}
	}

	@Override
	public Usuario comprobarUsuarioExistente(Connection con, Usuario usuarioDto) {
		Usuario usuario = new Usuario();
		
		try {
			String sql = "SELECT * FROM usuarios where usuario=? and password=?";
			PreparedStatement pStmt = con.prepareStatement(sql);
			pStmt.setString(1, usuarioDto.getUsuario());
			pStmt.setString(2, usuarioDto.getPassword());
			System.out.println(pStmt);
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()) {
				usuario.setId(rs.getInt("id"));
				usuario.setUsuario(rs.getString("usuario"));
				usuario.setPassword(rs.getString("password"));
				usuario.setFk_rol(rs.getInt("fk_rol"));
			}
		}catch (SQLException e) {
			System.out.println(e);
			usuario = new Usuario();
		}
		return usuario;
	}

}
