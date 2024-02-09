<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Alta de mobiliario</title>
<script>
	
	function cambioVisibilidad(){
		tipo = document.getElementById("tipo").value
		if(tipo == "M"){
			document.getElementById("estilo").style.display="block";
			document.getElementById("color").style.display="none";
			document.getElementById("potencia").style.display="none";	
		}else if(tipo == "S"){
			document.getElementById("estilo").style.display="none";
			document.getElementById("color").style.display="block";
			document.getElementById("potencia").style.display="none";	
		}else if(tipo == "L"){
			document.getElementById("estilo").style.display="none";
			document.getElementById("color").style.display="none";
			document.getElementById("potencia").style.display="block";	
		}else{
			document.getElementById("estilo").style.display="none";
			document.getElementById("color").style.display="none";
			document.getElementById("potencia").style.display="none";	
		}
		
	}
</script>
</head>
<body>

<form action="/ProyectoWebProfe/MueblesServlet" method="post">
	<select id="tipo" name="tipo" onchange="cambioVisibilidad()">
		<option value="0">Seleccione un mueble</option>
		<option value="M">Mesa</option>
		<option value="S">Sofá</option>
		<option value="L">Lámpara</option>
	</select>
	<br>
	Nombre <input name="nombre" type="text" placeholder="Nombre del mueble"> <br>
	Precio <input name="precio" type="number" placeholder="Precio del mueble"><br>
	
	<div id="estilo">Estilo <input name="estilo" type="text" placeholder="Estilo de la mesa"><br></div>
	<div id="color">Color <input name="color" type="text" placeholder="Color del sofá"><br></div>
	<div id="potencia">Potencia <input name="potencia" type="number" placeholder="Potencia de la lámpara"><br></div>
	
	<input type="submit" value="Guardar">	

</form>


</body>
</html>
