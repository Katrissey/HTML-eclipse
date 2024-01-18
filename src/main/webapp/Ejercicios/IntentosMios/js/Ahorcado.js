function probar () {
	if (letra.value== "b") {
	var inputLetra =document.getElementById ("oculto1");
	inputLetra.value = "b";
	} else if  (letra.value=="u") {
		var inputLetra = document.getElementById ("oculto2");
		inputLetra.value = "u";
	} else if (letra.value=="e") {
		var inputLetra = document.getElementById ("oculto3");
		inputLetra.value = "e";
	} else if (letra.value=="n") {
		var inputLetra = document.getElementById ("oculto4");
		inputLetra = "n";
	} else if (letra.value = "o") {
		var inputLetra = document.getElementById ("oculto5");
		inputLetra = "o";
	}
}

function oportunidades () {
	for (let i= 0; i<=4 ; i++) {
		document.write ("Tienes " + (5-i) + " oportunidades." )
		
	}
	function mayuscula (texto) {
		texto.toUpperCase();
		
	}
}