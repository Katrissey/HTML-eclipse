package ejercicios.muebles;

public class Sofa extends Mueble {
	
	//Declaramos los atributos de instancia
	private String color;

	/**Generamos el constructor con los atributos heredados
	 * del padre, más el específico de sofá
	 * @param nombre
	 * @param precio
	 * @param color
	 */
	public Sofa(String nombre, double precio, String color) {
		super(nombre, precio);
		this.color = color;
	}

	//Generamos los Getters y Setters
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sofa [" + (color != null ? "color=" + color : "") + "]";
	}
	
	

}
