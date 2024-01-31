<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "java.util.List, java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
 <!-- para empezar a escribir código java hemos de escribir "símbolo menor que " seguido de "porcentaje",
 luego el código java y finalmente "porcentaje" y "símbolo de mayor que" -->
  
  <%
  		List<String> colores = new ArrayList();
  		colores.add("verde");
  		colores.add("morado");
  		colores.add("azul");
  		colores.add("plateado");
  		colores.add("dorado");
  		
  		for (String color : colores) { 
  		%>
  		
  			
  		<%}
  
  %>
  
 <% for (int i = 0; i<10; i++ ) { %>
 <p>Esto es una prueba de jsp</p>
<% }%>
</body>
</html>