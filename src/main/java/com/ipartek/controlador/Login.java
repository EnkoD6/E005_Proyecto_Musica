package com.ipartek.controlador;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ipartek.modelo.DB_Helper;
import com.ipartek.modelo.dto.Usuario;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = "";
		if(request.getParameter("usuario") != null && !request.getParameter("usuario").isBlank()) {
			usuario = request.getParameter("usuario").trim();
		}
		
		String password = "";
		if(request.getParameter("password") != null && !request.getParameter("password").isBlank()) {
			password = request.getParameter("password");
		}
		
		Usuario usuarioDto = new Usuario(0, usuario, password, 0);
		
		DB_Helper db = new DB_Helper();
		Connection con = db.conectar();
		
		Usuario usuarioEncontrado = db.comprobarUsuarioExistente(con, usuarioDto);
		
		if(usuarioEncontrado.getId() > 0) {

			HttpSession session = request.getSession();
			
			session.setAttribute("s_id_usuario", usuarioEncontrado.getId());
			session.setAttribute("s_rol_usuario", usuarioEncontrado.getFk_rol());
			
		}
		
		
		int cierre = db.desconectar(con);
		
		String ruta = "index.jsp";
		if(usuarioEncontrado.getId()==1) {
			ruta = "MenuAdmin";
		}else if(usuarioEncontrado.getId()==2) {
			ruta = "MenuUser";
		}
		
		request.getRequestDispatcher(ruta).forward(request, response);
	}

}
