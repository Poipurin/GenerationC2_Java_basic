package cl.generation.f20221102.interfaces;

public class Caballo extends Herbívoro implements Genérico {

	@Override
	public void respirar() {

	}

	@Override
	public void comer() {
		System.out.println("Come pasto");
	}

}
