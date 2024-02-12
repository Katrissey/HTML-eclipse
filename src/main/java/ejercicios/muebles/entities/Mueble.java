package ejercicios.muebles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPO_DE_CLASE", discriminatorType=DiscriminatorType.STRING)
@Table (name = "TB_MUEBLE")
public abstract class Mueble {
	
	//Declaramos los atributos de instancia
	
			//allocationSize: Cantidad a incrementar de la secuencia cuando se arranca la aplicación
	@Id
	@SequenceGenerator (name = "MUEBLEGEN", sequenceName = "MUEBLE_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "MUEBLEGEN")
	@Column (name = "ID", nullable = false, updatable = false)
	private long id;
	
	@Column (name = "NOMBRE", length = 30)
	private String nombre;
	
	@Column (name = "PRECIO", length = 8)
	private double precio;
	
	
	
	/**Generamos el constructor vacío, necesario para que hibernate cree objetos, en este caso, no tipo mueble, sino del tipo de las hijas de Mueble
	 * 
	 */
	public Mueble() {
	
	}

	/**Generamos el constructor
	 * @param nombre
	 * @param precio
	 */
	public Mueble(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	//Generamos los Getters y Setters para que las clases hijas puedan llamar
	//al constructor del padre y crear objetos de su tipo concreto de mueble
	//con los atributos del padre.
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
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	
	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	//Pensaba que no sería necesario, que sobreescribiéndolo sólo en las clases hijas,
	//al heredar los atributos del padre, el "To String" los tomaría y lo generaría
	//con los atributos del padre y de cada hija, parece ser que es necesario para
	//que funcione el sobreescribirlo en todas las clases
	@Override
	public String toString() {
		return "Mueble [" + (nombre != null ? "nombre=" + nombre + ", " : "") + "precio=" + precio + "]";
	}

	
	
}
