package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta una vez
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		Float kilos = 0f;
		Float estatura = 0f;

		do {
			System.out.println("Ingresa tu edad");
			edad = sc.nextInt();

		} while (edad < 18 || edad > 120);

		System.out.println("edad ingresada " + edad);

		do {
			System.out.println("Ingresa tu peso");
			kilos = sc.nextFloat();

		} while (kilos < 35 || kilos > 130);

		System.out.println("peso ingresado " + kilos + "kg");

		do {
			System.out.println("Ingresa tu estatura");
			estatura = sc.nextFloat();

		} while (estatura < 1.50 || estatura > 2.65);

		System.out.println("estatura ingresada " + estatura + "m");

		sc.close();
	}

}
