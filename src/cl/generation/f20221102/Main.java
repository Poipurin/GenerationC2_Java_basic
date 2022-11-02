package cl.generation.f20221102;

import java.util.ArrayList;

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
		
		Kinesiológo kine = new Kinesiológo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("Kinesiología");
		kine.setEspecialidad("En músculos");
		
		ArrayList<Basquetbolista> listaJugadores = new ArrayList <Basquetbolista>();
		Basquetbolista basque = new Basquetbolista();
		basque.setNombre("Michael");
		basque.setApellido("Jordan");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque); //agregando un objeto a la lista
		
		Basquetbolista basque2 = new Basquetbolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Piper");
		basque2.setAltura(2.50f);
		
		listaJugadores.add(basque2);
		
		//recorrer lista
		for (Basquetbolista basquetbolista : listaJugadores) {
			System.out.println(basquetbolista.toString());
		}
		
		//instancia de clase nieta
		Ayudante ayudante = new Ayudante();
		ayudante.metodoImprimir();
		
	}
	




}
