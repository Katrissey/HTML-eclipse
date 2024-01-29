package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlet
 */
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public FormularioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException { //Sólo se ejecuta una vez, la primera vez que se ejecuta el servlet,
		//muy útil para conexión a base de datos
System.out.println ("Iniciando");	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
		
		System.out.println ("doPost FormularioServlet"); //Para comprobar, primero, que el servidor invoca a este método
		
		String caja1 = request.getParameter("caja1");
		String caja2 = request.getParameter("caja2");
		
		response.setContentType("text/html");
		response.getWriter().append("<H2>Resultado: " + caja1 + " " + caja2 + "</H2>" );

		
	}

}
