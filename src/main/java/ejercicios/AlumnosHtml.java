package ejercicios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "TB_ALUMNOS_HTML")
public class AlumnosHtml {
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	private Long id;
	
	@Column (length = 40, name = "NOMBRE")
	private String nombre;
	
	@Column (length = 100, name = "APELIDOS" )
	private String apellidos;
	
	@Column (length = 10, name = "SEXO")
	private String sexo;
	
	@Column (length = 120, name = "ASIGNATURA FAVORITA")
	private String asignaturaFavorita;
	
	@Column (length = 1000, name = "INFO ADICIONAL DEL ALUMNO")
	private String infoAdicional;

	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param asignaturaFavorita
	 * @param infoAdicional
	 */
	public AlumnosHtml(Long id, String nombre, String apellidos, String sexo, String asignaturaFavorita,
			String infoAdicional) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.asignaturaFavorita = asignaturaFavorita;
		this.infoAdicional = infoAdicional;
	}
	
	

	/**
	 * @param nombre
	 * @param apellidos
	 * @param sexo
	 * @param asignaturaFavorita
	 * @param infoAdicional
	 */
	public AlumnosHtml(String nombre, String apellidos, String sexo, String asignaturaFavorita, String infoAdicional) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.asignaturaFavorita = asignaturaFavorita;
		this.infoAdicional = infoAdicional;
	}



	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 */
	public AlumnosHtml(Long id, String nombre, String apellidos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * @param nombre
	 * @param apellidos
	 */
	public AlumnosHtml(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the asignaturaFavorita
	 */
	public String getAsignaturaFavorita() {
		return asignaturaFavorita;
	}

	/**
	 * @param asignaturaFavorita the asignaturaFavorita to set
	 */
	public void setAsignaturaFavorita(String asignaturaFavorita) {
		this.asignaturaFavorita = asignaturaFavorita;
	}

	/**
	 * @return the infoAdicional
	 */
	public String getInfoAdicional() {
		return infoAdicional;
	}

	/**
	 * @param infoAdicional the infoAdicional to set
	 */
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

	@Override
	public String toString() {
		return "Alumnos [" + (id != null ? "id=" + id + ", " : "") + (nombre != null ? "nombre=" + nombre + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "")
				+ (sexo != null ? "sexo=" + sexo + ", " : "")
				+ (asignaturaFavorita != null ? "asignaturaFavorita=" + asignaturaFavorita + ", " : "")
				+ (infoAdicional != null ? "infoAdicional=" + infoAdicional : "") + "]";
	}
	
	
	

}
