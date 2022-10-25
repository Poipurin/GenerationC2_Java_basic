package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		//1.- definición set o HashSet
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> Squirr3l = new HashSet<String>();
		
		
		//2.- agregar elemento al arreglo
		Squirr3l.add("Bárbara");
		Squirr3l.add("Brisa");
		Squirr3l.add("Fátima");
		Squirr3l.add("Gerald");
		Squirr3l.add("Sebastián");
		Squirr3l.add("Bárbara");
		System.out.println(Squirr3l); //no permite dato duplicado y lo coloca de foma aleatorea
		
		//3.-Verificar el contenido del arreglo
		boolean verificacionNombre = Squirr3l.contains("Brisa");//busca por la palabra clave
		System.out.println("Existe el relator? " +verificacionNombre);
		
		//4.- eliminar un elemento por objeto o contenido
		Squirr3l.remove("Bárbara"); //elimino por el elemento, sensible a mayus y minus
		System.out.println(Squirr3l);
		
		//5.- Tamaño del arreglo
		System.out.println("tamaño del hashset: " + Squirr3l.size());
		
		
		
		
	}

}
