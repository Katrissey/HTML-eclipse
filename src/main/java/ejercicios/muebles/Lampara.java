package ejercicios.muebles;

public class Lampara extends Mueble {
	
	//Declaramos los atributos de instancia específicos de la clase lámpara
	private String potencia;

	/**Generamos el constructor con los atributos heredados de la clase Mueble,
	 *más el específico de la clase Lampara
	 * @param nombre
	 * @param precio
	 * @param potencia
	 */
	public Lampara(String nombre, double precio, String potencia) {
		super(nombre, precio);
		this.potencia = potencia;
	}

	//Generamos los Getters y Setters
	/**
	 * @return the potencia
	 */
	public String getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Lampara [" + (potencia != null ? "potencia=" + potencia : "") + "]";
	}

}
