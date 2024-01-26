package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPrueba
 */
public class ServletPrueba extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletPrueba() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Aquí va el código que queremos que se ejecute cuando se ejecuta el Servlet
		
		if (request.getParameter("numero")!=null) { //para comprobar que la caja NO está vacía
			int numero = Integer.parseInt(request.getParameter("numero"));
			//Si es un número lo que queremos que guarde, como el método "getParameter()" da un String,
			//habremos de realizar un "parseInt" para transformarlo el número que lo lee como String
			//en un número verdadero con el que se pueda operar.
			
			if (numero%2==0) {
				response.getWriter().append("<H1>EL numero "+numero+"es par</h1>");
			}else {
				response.getWriter().append("<H1>EL numero "+numero+"es impar</h1>");
			}
		}else {
			response.getWriter().append("<H1>No has introducido el numero</h1>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Aquí va el código para que quede especificado qué queremos que haga el Servlet,
		//en este caso, con la información introducida en las cajas, guardándolas en variables para luego poder rescatar
		//dicha información, por ejemplo, para nuestra página de login, que el usuario y la contraseña se guarden
		//y podamos realizar consulta con alguno de los métodos del DAO para comparar la base de datos con los datos introducidos
		//y, así, comprobar si los mismos se encuentran en la base de datos o no.
	System.out.println("Pasando por el post"); //Para comprobar que, efectivamente, está paasndo la información por ahí
		
		List<String> usuarios = new ArrayList<String>();
		
		if (request.getParameter("caja1")!=null) {
			String caja1 = request.getParameter("caja1");
			String caja2 = request.getParameter("caja2");
			System.out.println("Se ha mandado el valor " + caja1 + caja2);
			response.getWriter().append("<H5>INSERTADO CORRECTAMENTE</h5>"); //Se comportaría, de algún modo, como una consola
			response.getWriter().append("<table>");
			response.getWriter().append("<th>Nombre</th><th>Apellidos</th>");
			for (String usuario : usuarios) {
				response.getWriter().append("<tr>");//crea las líneas de una tabla
				//Pero José Luis nos enseñará otra forma más sencilla y eficiente de hacerlo, a través de archivos "jsp"
				response.getWriter().append("</tr>");
			}
			
			response.getWriter().append("</table>");
			
		}else {
			System.out.println("No llega nada");
			response.setContentType("text/html");
			response.getWriter().append("<H5 style='color:red'>HA HABIDO UN ERROR</h5>");
		}
		
		
		
	}

	
	
}
