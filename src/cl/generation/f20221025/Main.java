package cl.generation.f20221025;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList
		//conjunto de datos segun el ingreso sin determinar el tamaño del arreglo
		//1.-definición de un arraylist
		//ArrayList <TIPODATO> nombre_array = new ArrayList <TIPODATO>(); estructura
		
		ArrayList <String> Squirr3l = new ArrayList <String>();
		//2.- Agregar valoes al arreglo
		
		Squirr3l.add("Bárbara");
		Squirr3l.add("Brisa");
		Squirr3l.add("Fátima");
		Squirr3l.add("Gerald");
		Squirr3l.add("Sebastián");
		System.out.println(Squirr3l);
		
		//3.-tamaño
		Squirr3l.size();
		System.out.println(Squirr3l.size());
		//4.- Obtener un elemento dentro del arreglo
		
		Squirr3l.get(0);
		System.out.println(Squirr3l.get(0));//fuera de los límites del índice
		
	//5.- Eliminar un elemento dentro del array
		
		Squirr3l.remove(0);//se desplazan hacia la posición inicial (todos quieren llegar a la posición 0)
		System.out.println(Squirr3l);
		
		Squirr3l.add("Bárbara"); //añadir
		
		//6.- recorrer el arraylist
		
		for(int i = 0; i<Squirr3l.size();i++){
			System.out.println("relator: "+ Squirr3l.get(i));
		}
		
		while (int i = 0; i<Squirr3l.size();i++){
			System.out.println("relator: "+ Squirr3l.get(i));
		}
		
		
		System.out.println("********");
		//For iterador o for de objeto, foreach
		
		for(String relator:Squirr3l) {
			System.out.println(relator);
		}
		
		
		ArrayList <Integer> numeros = new ArrayList <Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		
		
	}
	
	
	

}
