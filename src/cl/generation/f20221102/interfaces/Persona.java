package cl.generation.f20221102.interfaces;

public class Persona extends Humano {
	
	private String dni;

	public Persona(boolean razonamiento, String dni) {
		super(razonamiento);
		this.dni = dni;
	}
	public Persona() {
		super();
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", isRazonamiento()=" + isRazonamiento() + ", getPeso()=" + getPeso()
				+ ", getAltura()=" + getAltura() + "]";
	}
	
	
	
//Atributos
/*Altura
 * Peso
 * Razonamiento
 */
	//métodos
	/*metodoEnAnimal
	respirar
	comer*/
	
}
