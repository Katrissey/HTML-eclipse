<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Formulario de Muebles</title>
<script>
	function mostrarAtributo () {
		
		var selection = document.getElementById("SelecMueble").value;
		
		if (selection == "mesa") {
			document.getElementById("estila").style.display = "block";
			
		} else if () {
			
			
		} else if () {
			
			
		} else {
			
			
		}
		
		
	}

</script>

</head>
<body>

	<h1>FORMULARIO DE MUEBLES</h1>
	<br>

	<form id="ForMu" action="/ProyectoWebRo/MueblesServlet" method="post">
		<select id="SelecMueble" onchange="mostrarAtributo()">
				<option value="predeterminado" selected>Selecciona el tipo de mueble</option>
				<option value="mesa">Mesa</option>
				<option value="sofá">Sofá</option>
				<option value="lámpara">Lámpara</option>
		</select><br>
	
	Nombre: <input type="text" id="nombre" placeholder="Escribe el nombre del mueble" required><br>
	Precio: <input type="text" id="precio" placeholder="Escribe el precio del mueble" required><br>
	
	<input type="text" id="estiloMesa" style="display: none;" placeholder="Escribe el estilo de la mesa">
	<input type="text" id="colorSofa" style="display: none;" placeholder="Escribe el color del sofá">
	<input type="text" id="potenciaLampara" style="display: none;" placeholder="Escribe la potencia de la lámpara">

	<br><br>
	
	<input type="submit" value="Guardar">

	</form>

</body>
</html>