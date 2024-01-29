package ejercicios;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Alumnos {
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
	

}
