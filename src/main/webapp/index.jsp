<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="login" method="post">
		<input type="text" name="usuario" placeholder="Usuario" required>
		<input type="password" name="password" placeholder="Password" required>
		
		<input type="submit">
	
	</form>

<%
	if((int)session.getAttribute("s_rol_usuario")==0){
		%>
		<p>Usuario no encontrado</p>
		<%
	}
%>

</body>
</html>