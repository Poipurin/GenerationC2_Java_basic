package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// interfaces y clases abstractas
		// no se pueden instanciar clases abstractas
		// Animal animal = new Animal();

		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);
		caballo.setPeso(0);

		Humano humano = new Humano();
		humano.metodoEnAnimal();

		León leon = new León();
		leon.metodoEnAnimal();
		leon.setAltura(200f);
		leon.setPeso(0.80f);
		System.out.println(leon.toString());

		// imprimir valores seteados
		
		
		Persona persona = new Persona();
		persona.respirar();
	}

}
