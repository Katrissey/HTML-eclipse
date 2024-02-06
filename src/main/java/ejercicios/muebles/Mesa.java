package ejercicios.muebles;

public class Mesa extends Mueble {

	//Declaramos los atributos de instancia espacíficos de esta clase,
	//que se unirán a los heredados del padre.
	
	private String estilo;

	/**Generamos el constructor de la clase Mesa, llamando a los atributos del padre
	 * y añadiendo el específico de la clase Mesa
	 * @param nombre
	 * @param precio
	 * @param estilo
	 */
	public Mesa(String nombre, double precio, String estilo) {
		super(nombre, precio);
		this.estilo = estilo;
	}

	//Generamos los Getters y Setters
	/**
	 * @return the estilo
	 */
	public String getEstilo() {
		return estilo;
	}

	/**
	 * @param estilo the estilo to set
	 */
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Mesa [" + (estilo != null ? "estilo=" + estilo : "") + "]";
	}

	
	
}
