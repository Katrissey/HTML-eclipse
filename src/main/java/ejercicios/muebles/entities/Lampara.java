package ejercicios.muebles.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue (value = "LÁMPARA")
public class Lampara extends Mueble {
	
	//Declaramos los atributos de instancia específicos de la clase lámpara
	
	@Column (name = "POTENCIA", length = 8)
	private String potencia;

	
	
	/**Generamos el constructor vacío para que hibernate pueda crear los objetos necesarios para crear los elementos "Lampara" de la tabla
	 * 
	 */
	public Lampara() {
	
	}

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
