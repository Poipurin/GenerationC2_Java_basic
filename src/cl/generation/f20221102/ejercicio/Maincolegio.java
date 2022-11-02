package cl.generation.f20221102.ejercicio;

import java.util.ArrayList;

public class Maincolegio {

	public static void main(String[] args) {
		// profes
		ArrayList<Profesores> listaProfesores = new ArrayList<Profesores>();

		Profesores profesor = new Profesores();
		profesor.setNombre("Bárbara");
		profesor.setApellido("Pino");
		profesor.setCorreo("q@a");
		profesor.setEdad(22);
		profesor.setEspecialidad("Programacion");
		profesor.setJefatura("No");
		listaProfesores.add(profesor);

		Profesores profesor2 = new Profesores();
		profesor2.setNombre("Fátima");
		profesor2.setApellido("Requena");
		profesor2.setCorreo("q@a");
		profesor2.setEdad(22);
		profesor2.setEspecialidad("Matematicas");
		profesor2.setJefatura("Si");
		listaProfesores.add(profesor2);

		Profesores profesor3 = new Profesores();
		profesor3.setNombre("Alejandro");
		profesor3.setApellido("Heredia");
		profesor3.setCorreo("q@a");
		profesor3.setEdad(28);
		profesor3.setEspecialidad("Ayudante");
		profesor3.setJefatura("No");
		listaProfesores.add(profesor3);

		System.out.println(listaProfesores.toString());

		for (Profesores profesores : listaProfesores) {
			System.out.println(profesores.toString());
		}
		;

		// Alumnos
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();

		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Miguel");
		alumno1.setApellido("Sandoval");
		alumno1.setCorreo("Migue@gmail.com");
		alumno1.setEdad(14);
		alumno1.setCurso("1C");
		alumno1.setPromedio(6.2f);

		listaAlumnos.add(alumno1);

		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Felipe");
		alumno2.setApellido("Gonzalez");
		alumno2.setCorreo("fg@q");
		alumno2.setEdad(16);
		;
		alumno2.setCurso("2B");
		alumno2.setPromedio(6.3f);

		listaAlumnos.add(alumno2);

		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Juan");
		alumno3.setApellido("Perez");
		alumno3.setCorreo("Juanpe@gmail.com");
		alumno3.setEdad(15);
		;
		alumno3.setCurso("2C");
		alumno3.setPromedio(5.5f);

		listaAlumnos.add(alumno3);

		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno.toString());
		}
		;

		// Admin
		ArrayList<Administrativos> listaAdministrativos = new ArrayList<Administrativos>();
		Administrativos admin1 = new Administrativos();
		admin1.setNombre("Sebastian");
		admin1.setApellido("Garrido");
		admin1.setCorreo("q@a");
		admin1.setEdad(23);
		admin1.setArea("RRHH");
		admin1.setCargo("Secretario de estudios");

		listaAdministrativos.add(admin1);

		Administrativos admin2 = new Administrativos();
		admin2.setNombre("Gerald");
		admin2.setApellido("Opitz");
		admin2.setCorreo("q@a");
		admin2.setEdad(40);
		admin2.setArea("Administración");
		admin2.setCargo("Sostenedor");
		listaAdministrativos.add(admin2);

		Administrativos admin3 = new Administrativos();
		admin3.setNombre("Brisa");
		admin3.setApellido("Sandoval");
		admin3.setCorreo("q@a");
		admin3.setEdad(23);
		admin3.setArea("Administracion");
		admin3.setCargo("Directora");
		listaAdministrativos.add(admin3);

		for (Administrativos administrativo : listaAdministrativos) {
			System.out.println(administrativo.toString());
		}

	}

}
