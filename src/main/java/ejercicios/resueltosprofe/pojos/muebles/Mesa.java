package ejercicios.resueltosprofe.pojos.muebles;

public class Mesa extends Mueble {
	private String estilo;

	public Mesa(String nombre, double precio, String estilo) {
		super(nombre, precio);
		this.estilo = estilo;
	}

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
	
	
}
