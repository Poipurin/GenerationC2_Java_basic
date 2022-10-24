package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		/*Arreglos en Java(Aray)
		  son estáticos, no cambian de tamaño
		  
		  tipodedato[] nombredelarray=new tipodedato[cantidad de datos a almacenar];
*/
		
		int [] arreglo= new int [3];
		//tamaño del arreglo
		//agregar datos (todos parten en el 0) 
		arreglo [0]=4;
		arreglo [1]=5;
		arreglo [2]=8;
		//arreglo [3]=12;  está fuera del tamaño establecido del arreglo 
		System.out.println(arreglo.toString());//espacio de memoria 
		System.out.println(Arrays.toString(arreglo));// clase padre de todos los array, acá si lo convierte 
		System.out.println(arreglo[0]);
		//para un arreglo vacío no se puede
		//para asignar valores por defecto usamos las llaves		
		int[] sinNumeros = { };//cero, cantidad de elementos que tiene el arreglo
		System.out.println(sinNumeros.length);
		
		String [] vocales = {"a","e","i","o","u"}; //el tamaño del arreglo es 5
		System.out.println("cantidad de elementos " +vocales.length);
		vocales [1] = "o";//se sobre escribe mientras sea un string
		vocales [3] = "e";
		
		System.out.println(" " +vocales[1]);
		
		//crear un array de números flotantes de tamaño 6
		float [] numeros = new float [6];
		System.out.println(" " +numeros.length);
		//agregar 6 elementos al arreglo
		
		numeros[0]= 22.4f;
		numeros[1]= 8f;
		numeros[2]= 4f;
		
		int [] numeroInt= new int[2];
		numeroInt[0] = (int)0.2; //0.0, ignora el flotante al castear
		System.out.println(" " +numeroInt[0]);
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinámicamente desde el 1 al 100
		
		int [] enteritos= new int[100];
		for(int i=1; i<= enteritos.length;i++) {
			enteritos[i-1]=i;
		
	}
		
		System.out.println(Arrays.toString(enteritos));
		
		//inverso
		int [] num100al1= new int[100];
		for(int i =num100al1.length; i>0;i--) {//inverso
			num100al1[num100al1.length-i]=i;//no existe la posición 100
		
	}
		
		System.out.println(Arrays.toString(num100al1));
	}
	
	//


}
