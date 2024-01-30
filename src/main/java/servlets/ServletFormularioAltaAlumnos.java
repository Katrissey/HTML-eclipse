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

/**
 * Servlet implementation class FormularioAltaAlumnos
 */
public class ServletFormularioAltaAlumnos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	List<AlumnosHtml> alumnosHtml = new ArrayList<AlumnosHtml>();

    /**
     * Default constructor. 
     */
    public ServletFormularioAltaAlumnos() {
        // TODO Auto-generated constructor stub
    }

    
    
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//super.init(config); no es indispensable, sale por defecto al sobreescribir est método
		
	
		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				
		if (request.getParameter("Nombre") != null && request.getParameter("Apellidos") != null) {
			String nombre = request.getParameter("Nombre");
			String apellidos = request.getParameter("Apellidos");
			String sexo = request.getParameter("Sexo");
			String asignaturaFavorita = request.getParameter("Escoge_tu_asignatura_favorita");
			String infoAdicionalAlumno = request.getParameter("Información_adicional_del_alumno");
			
			AlumnosHtml alumno = new AlumnosHtml (nombre, apellidos, sexo, asignaturaFavorita, infoAdicionalAlumno);
			
			alumnosHtml.add(alumno);
			
			response.getWriter().append("Bienvenido " + alumno.getNombre() + alumno.getApellidos());
			
			response.setContentType("text/html");
			
			for (AlumnosHtml alumnoHtml : alumnosHtml) {
				
				response.getWriter().append("<H2>La lista actual de alumnos registrados es: " + "\n" + alumnoHtml.getNombre() + "  " + alumnoHtml.getApellidos() + "\n<H2>");
			
			}
			
		} else {
			response.getWriter().append("Faltan por rellenar campos");
		}
		
	}

}
