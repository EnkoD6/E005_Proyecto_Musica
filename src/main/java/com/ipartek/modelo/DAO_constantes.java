package com.ipartek.modelo;

public interface DAO_constantes {

	   String NOMBRE_BD="bd_canciones";
	   String RUTA="jdbc:mysql://localhost:3306/"+NOMBRE_BD;
	   String DRIVER="com.mysql.cj.jdbc.Driver";
	   String USUARIO="root";
	   String PASS="1234";
	   
	   //constantes de las tablas de la BD
	   
	   

	   //constantes de las vistas jsp
	   String JSP_USER = "user.jsp";
	   String JSP_ADMIN = "admin.jsp";
	   
	   //regex
	   String REGEX_DOUBLE="[+]?\\d+(\\.\\d{1,2})?([eE][+-]?\\d+)?";
	   
	   
}
