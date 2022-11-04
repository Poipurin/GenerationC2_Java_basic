package cl.generation.f20221026;

import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {

	}

	public static void datos() {

		Scanner scanner = new Scanner(System.in);
		int edad = 0;
		float kilos = 0;
		float estatura = 0;
		float imc = kilos / (estatura * estatura);

		//

		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();

		System.out.println("Ingrese su apellido paterno: ");
		String apellidoPaterno = scanner.next();

		System.out.println("Ingrese su apellido materno: ");
		String apellidoMaterno = scanner.next();

		do {
			System.out.println("Ingrese su edad");
			edad = scanner.nextInt(); // scaneamos una variable de tipo int ya que lo asociamos a la variable que está
										// fuera del dowhile.

		} while (edad < 18 || edad > 120); // mientras la condición sea verdadera, el ciclo se repetirá infinitas veces.

		//
		do {
			System.out.println("Ingrese su peso");
			kilos = scanner.nextFloat();

		} while (kilos < 40 || kilos > 300);

		do {
			System.out.println("Ingrese su estatura");
			estatura = scanner.nextFloat();
		} while (estatura < 1.01 || estatura > 3.00);

		if (imc < 18.5f) {
			System.out.println(nombre + " " + apellidoPaterno + " " + apellidoMaterno + " de " + edad
					+ " años de edad, con una estatura de " + estatura + " con un IMC de" + imc
					+ " se encuentra bajo peso");

		} else if (imc >= 18.5f && imc < 25) {
			System.out.println(nombre + " " + apellidoPaterno + " " + apellidoMaterno + " de " + edad
					+ " años de edad, con una estatura de " + estatura + " con un IMC de" + imc
					+ " se encuentra en un peso normal");

		} else if (imc >= 25 && imc < 30) {
			System.out.println(nombre + " " + apellidoPaterno + " " + apellidoMaterno + " de " + edad
					+ " años de edad, con una estatura de " + estatura + " con un IMC de" + imc
					+ " se encuentra sobre peso");

		} else {
			System.out.println(imc);

			System.out.println(nombre + " " + apellidoPaterno + " " + apellidoMaterno + " de " + edad
					+ " años de edad, con una estatura de " + estatura + " con un IMC de" + imc

					+ " se encuentra obeso");

		}

		scanner.close();
	}

}
