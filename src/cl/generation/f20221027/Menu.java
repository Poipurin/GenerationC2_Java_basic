package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opciones = 0; // variables en el bloque superior
		int contadorErrores=4;
		
		
		// Menú de opsciones
		// terminar la ejecución
		menu();

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
		
		if(opciones ==0| |) {
			System.out.println("Adios!!");
		}else {
			System.out.println("fuera del while " + opciones);
		}
		
		
		
		// Calculadora con 4 operaciones básicas
		// solicitar y capturar 2 números float
		// imprimir resultados y guardar en una variable
		// Ofrecer opciones
		// Definir los métodos
		// validaciones

		// limpiar las variables

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
	}

}
