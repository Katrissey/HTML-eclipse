package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ejercicios.AlumnosHtml;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class FormularioAltaAlumnos
 */
public class ServletFormularioAltaAlumnos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<AlumnosHtml> alumnosHtml;

	/**
	 * Default constructor.
	 */
	public ServletFormularioAltaAlumnos() {
		System.out.println("Este es el constructor del Servlet de AlumnosHtml");
		// Para comprobar que pasa por aquí, es una traza.
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// super.init(config); no es indispensable, sale por defecto al sobreescribir
		// est método
		alumnosHtml = new ArrayList<AlumnosHtml>(); // Inicializamos aquí la lista de alumnosHtml
		// para que se cree al iniciar el servidor

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * Para crear sesión de usuario hay que hacer los iguiente y, a la hora de importar,
		 * hacerlo con "import jakarta.servlet.http.HttpSession;", ya que es el tipo de objeto
		 * que devuelve el "request.getSession();
		 */
		HttpSession session = request.getSession();
		
		if (request.getParameter("Nombre") != null && request.getParameter("Apellidos") != null) {
			String nombre = request.getParameter("Nombre");
			String apellidos = request.getParameter("Apellidos");
			String sexo = request.getParameter("Sexo");
			String asignaturaFavorita = request.getParameter("Escoge_tu_asignatura_favorita");
			String infoAdicionalAlumno = request.getParameter("Información_adicional_del_alumno");

			AlumnosHtml alumno = new AlumnosHtml(nombre, apellidos, sexo, asignaturaFavorita, infoAdicionalAlumno);

			alumnosHtml.add(alumno);

			response.getWriter().append("Bienvenido " + alumno.getNombre() + alumno.getApellidos());

			response.setContentType("text/html");

			for (AlumnosHtml alumnoHtml : alumnosHtml) {

				response.getWriter().append("<H2>La lista actual de alumnos registrados es: " + "\n"
						+ alumnoHtml.getNombre() + "  " + alumnoHtml.getApellidos() + "\n<H2>");

			}

		} else {
			response.getWriter().append("Faltan por rellenar campos");
		}

	}

}
