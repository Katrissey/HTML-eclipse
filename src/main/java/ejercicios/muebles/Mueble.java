package ejercicios.muebles;

public class Mueble {
	
	//Declaramos los atributos de instancia
	private String nombre;
	private double precio;
	
	
	/**Generamos el constructor
	 * @param nombre
	 * @param precio
	 */
	public Mueble(String nombre, double precio) {
		super();
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
