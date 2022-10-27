package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		// Menú de opsciones
		// terminar la ejecución
		menu();

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

		Scanner sc = new Scanner(System.in);
		int opciones = 0; // variables en el bloque superior
		int contadorErrores = 4;

		do {
			System.out.println("*Seleccione una opción del menú*");
			opciones = sc.nextInt();
			// si la opción es 0, salir del doWhile

			if (opciones == 0) {
				System.out.println("Saliste del progama, salu2");
				break;// salir
			}

			if (opciones < 0 || opciones > 4) {
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			} else if (contadorErrores == 0) {
				System.out.println("Agotó la cantidad de intentos, chao nos vimos");
				break;
			}

		} while (opciones < 0 || opciones > 4);

		// System.out.println(contadorErrores); //referencial para los programines

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {// solo ingresará para opciones 1,2,3,4
			//System.out.println("fuera del while " + opciones);
			//solicitar números (con scanner)
			System.out.println("Ingresa el primer número");
			float num1 = sc.nextFloat();
			System.out.println("Ingresa el segundo número");
			float num2 = sc.nextFloat();
			
			float resultado =0;
			
			switch (opciones) {
			case 1://Sumar
				resultado = num1 + num2;
				System.out.println("El resultado de la suma es "+ resultado);
				
				break;
			case 2://restar
				resultado = num1 - num2;
				System.out.println("El resultado de la resta es "+ resultado);
				break;
				
			case 3://multi
				resultado = num1 * num2;
				System.out.println("El resultado de la multiplicación es "+ resultado);
				break;
			case 4://división
				
				if(num2==0) {
					System.out.println("Amigo no divida por 0 ;'c");
					
				}else {
					resultado = num1 / num2;
					System.out.println("El resultado de la división es "+ resultado);
				}
				
				break;

			default:
				System.out.println("Opción no válida");
				break;
			}

		}

	}

}
