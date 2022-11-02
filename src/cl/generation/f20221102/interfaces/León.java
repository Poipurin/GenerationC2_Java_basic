package cl.generation.f20221102.interfaces;

public class León extends Carnívoro implements Genérico {

	@Override
	public void respirar() {

	}

	@Override
	public void comer() {
		System.out.println("El león come carne");

	}

	@Override
	public String toString() {
		return "León [Peso()=" + getPeso() + ", Altura()=" + getAltura() + "]";
	}
}
