package cl.generation.f20221027;

import java.util.Scanner;

public class areasYPerímetros {
	public static void main(String[] args) {
		menu();
	}
	public static void rectangulo() {
		// calculo del perimetro
		Scanner scannerRectangulo = new Scanner(System.in);
		System.out.println("Ingrese el ancho");
		float anchoRectangulo = scannerRectangulo.nextFloat();
		System.out.println("Ingrese la altura");
		float largoRectangulo = scannerRectangulo.nextFloat();
		float perimetroRectangulo = (anchoRectangulo + largoRectangulo) * 2;
		System.out.println("El perímetro del rectángulo es " + perimetroRectangulo);
		float areaRectangulo = anchoRectangulo * largoRectangulo;
		System.out.println("El área del rectángulo es " + areaRectangulo);
		scannerRectangulo.close();
	}
	public static void triangulo() {
		Scanner scannerTriangulo = new Scanner(System.in);
		System.out.println("Ingresa la base");
		double baseTriangulo = scannerTriangulo.nextDouble();
		System.out.println("Ingresa la altura");
		double alturaTriangulo = scannerTriangulo.nextDouble();
		double resultado_perimetro = baseTriangulo + alturaTriangulo
				+ (Math.sqrt((alturaTriangulo * alturaTriangulo) + ((baseTriangulo / 2) * (baseTriangulo / 2))) * 2);
		System.out.println(("El perimetro es " + resultado_perimetro));
		double resultado_area = (baseTriangulo * alturaTriangulo) / 2;
		System.out.println(("El area es " + resultado_area));
		scannerTriangulo.close();
	}
	public static void circunferencia() {
		Scanner scannerCircunferencia = new Scanner(System.in);
		System.out.println("Ingresa el diametro ");
		double diametroCircunferencia = scannerCircunferencia.nextFloat();
		double perimetroCircunferencia = diametroCircunferencia * Math.PI;
		System.out.println("El perimetro es " + perimetroCircunferencia);
		double areaCircunferencia = (diametroCircunferencia / 2) * (diametroCircunferencia / 2) * Math.PI;
		System.out.println("El área es" + areaCircunferencia);
		scannerCircunferencia.close();
	}
	public static void menu() {
		System.out.println("*****************************");
		System.out.println("*     Áreas y Perímetros    *");
		System.out.println("*****************************");
		System.out.println("*1.-   Circunferencia       *");
		System.out.println("*2.-    Rectángulo          *");
		System.out.println("*3.-     Triángulo          *");
		System.out.println("*****************************");
		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 3;
		do {
			System.out.println("Seleccione una opción");
			opciones = sc.nextInt();
			if (opciones == 0) {
				System.out.println("Has salido del programa");
				break;
			}
			if (contadorErrores == 1 && opciones > 3) {
				System.out.println("Intentos agotados, has salido del programa");
				break;
			} else if (opciones < 0 || opciones > 3) {
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
		} while (opciones < 0 || opciones > 3);
		
		switch (opciones) {
		case 1:
			circunferencia();
			break;
			
		case 2:
			rectangulo();
			break;
			
		case 3:
			triangulo();
			break;
		default:
			break;
		}
		sc.close();
	}
}
