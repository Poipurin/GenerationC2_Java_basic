package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class DatosEstudiante {

	public static void main(String[] args) {
		//llamar
		//menu();
		listaEstudiantes();
	
	}
	
	/*public static void menu () {//llamar método desde el main
	int opciones = 0;
	  System.out.println("***** MENÚ *****");
	  System.out.println("(1) Agregar estudiante"); 
	  System.out.println("(2) Salir");
	  Scanner scMenu = new Scanner(System.in);
	  
	  do {
		  System.out.println("Seleccione una opción");
		  opciones = scMenu.nextInt(); 			
		  if(opciones == 2) {
		  System.out.println("Hasta pronto");
	  }
		
	} while (opciones == 1);
	  
	  switch (opciones) {
	case 1: {
		
		listaEstudiantes();
		break;
	}
	default:
		break;
	}
	 
	  scMenu.close();
	  
	}*/
	
	
	
	public static void listaEstudiantes() {
		Scanner sc = new Scanner(System.in);//Inicio scanner
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>(); //Inicio arreglo estudiantes
		int continuar = 2;
		 
		do {
			
			//Pido al usuario que llene los campos de de los estudiantes
			System.out.println("Ingrese el nombre del estudiante");
			String nombre = sc.nextLine ();
			System.out.println("Ingrese el apellido del estudiante");
			String apellido = sc.nextLine ();
			System.out.println("Ingrese la edad del estudiante");
			Integer edad = sc.nextInt ();
			System.out.println("Ingrese el rut del estudiante");
			String rut = sc.nextLine ();
			sc.nextLine();
			System.out.println("Ingrese el curso del estudiante");
			String curso = sc.nextLine ();
			System.out.println("Ingrese el teléfono del estudiante");
			Integer telefono = sc.nextInt ();
			sc.nextLine();
			System.out.println("Ingrese el correo del estudiante");
			String correo = sc.nextLine ();
			
			//Capturo los datos de los estudiantes que ingresa el usuario
			Estudiante estudiante = new Estudiante(); //Instancio al objeto
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			estudiante.setEdad(edad);
			estudiante.setRut(rut);
			estudiante.setCurso(curso);
			estudiante.setTelefono(telefono);
			estudiante.setCorreo(correo);
			
			estudiantes.add(estudiante); // Ingreso estudiante al arreglo
			
			//Pregunto al usuario se desea seguir ingresando estudiantes
			System.out.println("¿Desea seguir ingresando estudiantes?");
			System.out.println("(1)SI   (2)NO");
			continuar= sc.nextInt();
			sc.nextLine(); //corrige bug "nextInt -> nextLine"
			
			if (!(continuar==1)) {
				System.out.println("Has terminado de ingresar estudiantes");
				System.out.println();
				break;
			} else {
				
			}
			
		} while (continuar==1);
		
		//Muestro los estudiantes ingresados al usuario
		
		System.out.println("***********************************");
		System.out.println();
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Estudiante: "+ "Nombre completo: "+estudiante.getNombre() +" "+estudiante.getApellido()+" "+"Edad: "+estudiante.getEdad()+" "+"RUT: "+estudiante.getRut()+" "+"Curso: "+estudiante.getCurso()+" "+"Teléfono: "+estudiante.getTelefono()+" "+"Correo: "+estudiante.getCorreo());
		}
		System.out.println();
		System.out.println("***********************************");
		
		//Obtener un dato específico del estudiante
		estudiantes.get(0);//obtener estudiante por posición
		estudiantes.get(0).getRut(); //obtener posición y dato
		sc.close();
		
		
	}
	
}
