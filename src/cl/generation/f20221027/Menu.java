package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menú de opciones
		// terminar la ejecución		
		// Calculadora con 4 operaciones básicas
		// solicitar y capturar 2 números float
		// imprimir resultados y guardar en una variable
		// Ofrecer opciones
		// Definir los métodos
		// validaciones
		// limpiar las variables
		
		menu();

	}

	public static void menu() {
		System.out.println("**********************");
		System.out.println("*   Menú             *");
		System.out.println("**********************");
		System.out.println("*1  suma             *");
		System.out.println("*                    *");
		System.out.println("*2  resta            *");
		System.out.println("*                    *");
		System.out.println("*3  multiplicación   *");
		System.out.println("*                    *");
		System.out.println("*4  división         *");
		System.out.println("*                    *");
		System.out.println("*0  Salir            *");
		System.out.println("**********************");
		
		Scanner sc = new Scanner(System.in);
		int opciones = 0; // variables en el bloque superior
		int contadorErrores=4;
		do {
			System.out.println("*Seleccione una opción del menú*");
			opciones = sc.nextInt();
			//si la opcion es 0, salir del doWhile
			
			if(opciones==0) {
				System.out.println("Saliste del progama, salu2");
				break;//salir
			}
			
			if(contadorErrores==0) {
				System.out.println("Agotó la cantidad de intentos, chao nos vimos");
				break;
			}else if(opciones <0 || opciones >4) {
				contadorErrores--;
				System.out.println("Te quedan "+contadorErrores+ " intentos");
			}
			
		} while (opciones <0 || opciones >4);
		
		//System.out.println("fuera del while " + opciones); //referencial para los programines
		
		if(opciones ==0) {
			System.out.println("Adios!!");
		}else {
			System.out.println("fuera del while " + opciones);
		}
		
		System.out.println("Ingresa el primer numero");
		float numero1 = sc.nextFloat();
		System.out.println("Ingresa el segundo numero");
		float numero2 = sc.nextFloat();	
		
		float resultado = 0;
		
		switch (opciones) {
		case 1:
			resultado = numero1 + numero2;
			System.out.println("El resultado es " +resultado);
			break;
			
		case 2:
			resultado = numero1 - numero2;
			System.out.println("El resultado es " +resultado);
			break;
			
		case 3:
			resultado = numero1 * numero2;
			System.out.println("El resultado es " +resultado);
			break;
		case 4:
			if(numero2 == 0) {
				System.out.println("No dividas por cero de nuevo o el mundo va a explotar :c");
			}
			else {
				resultado = numero1 / numero2;
				System.out.println("El resultado es " +resultado);	
			}
			break;
			

		default:
			System.out.println("Opcion no válida");
			break;
		}
		
		sc.close();
		
		
	}

}
