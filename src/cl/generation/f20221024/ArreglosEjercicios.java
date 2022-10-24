package cl.generation.f20221024;

import java.util.Arrays;

public class ArreglosEjercicios {

	public static void main(String[] args) {
		
		/*Escribir un arreglo de tamaño de 10 ,
		con números positivos y negativos , capturar en máximo y mínimo*/
		
		int[] numa10 = {-3,-5,4,12,3,35,-35,77,-1,0};
		int maxNuma10 = 0;
		int minNuma10 = 0;
		for (int i=0; i>=numa10.length; i++ ) {
			numa10[i]=i;
		}
		for (int i=0; i<numa10.length; i++ ) {
			if (maxNuma10 < numa10[i]) {
				maxNuma10 = numa10[i];
			}else if(minNuma10 > numa10[i]){
				minNuma10 =numa10[i];
			}
		}
		System.out.println(Arrays.toString(numa10));
		System.out.println(maxNuma10);
		System.out.println(minNuma10);
		
		
		
		
		/*2. El mismo arreglo crear otros 2 arreglos, uno con solo 
		 * los pares y otro arreglo solo con los impares*/
	
		int[] pares = new int [numa10.length];
		int[] impares= new int [numa10.length];
		
		for(int i = 0; i < numa10.length; i++) {//recorre
			if(numa10[i] %2 == 0) {//obtenemos el par por el resto
				pares[i] = numa10[i];
		} else {
			impares[i] = numa10[i];
		}
			System.out.println(Arrays.toString(pares));
			System.out.println(Arrays.toString(impares));
}
		
		
		
		
		//3. Para el mismo arreglo, sacar el promedio de los números.
		float sumanuma = 0;
		for(int i = 0; i < numa10.length;i++)
		{
			sumanuma = sumanuma + numa10[i];
		}
		
		System.out.println(sumanuma);
		
		
		
		
		
	}
}
