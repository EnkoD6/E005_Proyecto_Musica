package com.ipartek.modelo;

import java.sql.Connection;

import com.ipartek.modelo.dto.Usuario;




public interface DAO_metodos {

	Connection conectar();
	int desconectar(Connection con);
	Usuario comprobarUsuarioExistente(Connection con, Usuario usuarioDto);
	
}
