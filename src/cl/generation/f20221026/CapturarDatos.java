package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		// capturar datos ingresados po el ususario

		Float imc = calculoIMC();
		nivelIMC(imc);

	}

	public static Float calculoIMC() {
		Scanner scanner = new Scanner(System.in); // de entrada (captura) , syso de salida
		// calculo del IMC;
		// imc= kilos /(estatura*estatura);
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 24.9 Normal 25.0 29.9 Sobrepeso 30.0 o más
		 * Obeso
		 */

		System.out.println("Ingrese su peso en kilogramos");
		Float peso = scanner.nextFloat();
		System.out.println("El peso es: " + peso + "kg");
		System.out.println("Ingrese su estatura");
		Float estatura = scanner.nextFloat();
		System.out.println("La estatura es: " + estatura + "m");

		Float imc = peso / (estatura * estatura);
		scanner.close(); // cerrar el escaner, a mimir.
		System.out.println("Su IMC es: " + imc);
		return imc;

	}

	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0 o
		 * más Obeso
		 */

		if (IMC < 18.5f) {
			System.out.println("Su IMC está por debajo de lo normal");
		} else if (IMC >= 18.5 && IMC < 25) {
			System.out.println("Su IMC es normal");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("Su IMC es indica que tiene sobrepeso");
		} else {
			System.out.println("Su IMC es indica que está obeso");
		}
	}

}
