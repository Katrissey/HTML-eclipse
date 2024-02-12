package ejercicios.muebles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue (value ="SOFÁ")
public class Sofa extends Mueble {
	
	//Declaramos los atributos de instancia
	@Column (name = "COLOR", length = 20)
	
	private String color;

	/**Generamos el constructor vacío paar que hibernate pueda crear objetod de tipo "Sofa" para crear los elementos "Sofa" de la tabla
	 *  
	 */
	public Sofa() {
		
	}

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
