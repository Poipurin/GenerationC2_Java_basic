package cl.generation.f20221025;

import java.util.HashMap;

public class ArregloHashMapTest {

	public static void main(String[] args) {
		// HashMap
		// llave, valor (key, value)
		HashMap<Integer, String> relatores = new HashMap<Integer, String>();

		// 2.- agregar valor al map
		relatores.put(4, "Alejandro");
		relatores.put(2, "Alejo");
		relatores.put(3, "Pía");
		relatores.put(4, "Pamela");
		relatores.put(33, "Laura");
		relatores.put(5, "Pamela");// si existe esa clave, sobre escribe el valor
		System.out.println("map" + relatores);

		// 3.- tamaño map
		System.out.println(relatores.size());

		// 4.- acceder a un dato a través de la clave
		relatores.get(33);// Laura
		System.out.println(relatores.get(4));

		// 5.- Remover un par de datos
		relatores.remove(4);
		System.out.println("map " + relatores);

		// 6.- Recorremos un map
		// formap

		for (Integer clave : relatores.keySet()) {
			System.out.println("clave " + clave + " valor " + relatores.get(clave));
		}

	}

}
