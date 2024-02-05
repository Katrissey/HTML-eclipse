<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.util.List,ejercicios.AlumnosHtml"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<h1>LISTA DE ALUMNOS</h1>
<%
//Creamos una variable Lista de tipo AlumnoHtml para que guarde la lista de alumnos
//obtenida en el request
//Realizamos un cast para decirle a java que el objeto no es de tipo object
// sino de tipo AlumnosHtml
List<AlumnosHtml> alumnos = (List<AlumnosHtml>)request.getAttribute("");
//Ahora haremos un "sysout" para comprobar que está pasando por aquí y, de paso,
//el número de alumnos que se han insertado hasta este momento.
//Recordar que esta información se verá sólo por consola.
System.out.println ("El número de alumnos insertados es " + alumnos.size());
%>

	<table>
		
		<tr>
			<tr>Nombre</tr>
			<tr>Apellidos</tr>
			<tr>Sexo</tr>
			<tr>Asignatura favorita</tr>
			<tr>Información adicional del alumno</tr>
		</tr>
		<%
		for (AlumnosHtml alumno : alumnos){
		%>
			
	
	<% } %>
	
	</table>

</body>
</html>