package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar a Estudiante
		/*Estudiante estudiante = new Estudiante("Mijail","Loren","27868123-4");
		System.out.println(estudiante.toString());
		estudiante.setEdad(3);
		estudiante.setCorreo("m@m.cl");
		estudiante.setCurso("1A");
		System.out.println(estudiante.toString());*/
		
		Scanner sc = new Scanner(System.in);
		//arrelo de estudiantes
		ArrayList<Estudiante> estudiantes= new ArrayList<Estudiante>();
		//String nombre= "";
		
		int continuar=2;
		do {
			
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine();// israel alexis
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine();
			//instancia al objeto estudiante 
			//Estudiante estudiante = new Estudiante(nombre,apellido);
			Estudiante estudiante = new Estudiante();
			//asignando un valor al atributo del objeto
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			
			//agregamos un objeto al arreglo con add
			estudiantes.add(estudiante);
			
			
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("(1)SI  (2)NO");
			continuar= sc.nextInt();
			sc.nextLine();//corrige el error de capturar un numero y despues solicitar un string
			
		} while (continuar==1);
		System.out.println("******************");
		for (Estudiante estudiante : estudiantes) {
			System.out.println("nombre: "+estudiante.getNombre());
			System.out.println("apellido: "+estudiante.getApellido());
			System.out.println();
			System.out.println("******************");
		}
		
		//Obtener un estudiante especifico por posición
		estudiantes.get(0);
		
		//accedemos a un atributo del objeto
		estudiantes.get(0).getNombre();
		sc.close();
		
		
		
		
		
		
		
	}
}