package cl.generation.f20221027;

import java.util.Scanner;

public class UsoPaciente {

	public static void main(String[] args) {
		// Instancia de clases
		
		Paciente paciente1 = new Paciente();
		// crear scanner
		Scanner scanner = new Scanner(System.in);

		// Pedir al paciente que ingrese a sus datos.

		System.out.println("Ingrese su nombre");
		String nombre = scanner.next();
		paciente1.setNombre(nombre);
		System.out.println("Ingrese su apellido paterno");
		paciente1.setApellido(scanner.next());
		System.out.println("Ingrese su dirección");
		paciente1.setDireccion(scanner.next());
		System.out.println("Ingrese su teléfono");
		paciente1.setTelefono(scanner.nextInt());
		System.out.println("Ingrese su correo");
		paciente1.setCorreo(scanner.next());

		System.out.println(paciente1.toString());
		scanner.close();
	}

}
