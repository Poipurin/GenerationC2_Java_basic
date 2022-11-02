package cl.generation.f20221102;

public class Main {

	public static void main(String[] args) {
		// Herencia en java
		//instanciando objetos
		Entrenador entrenador = new Entrenador(); //instanciar entrenador
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAniosExperiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		
	}

}
