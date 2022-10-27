package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones o metodos
		//llamar a un método
		nombreMetodo();
		metodo2("Mcgee");
		metodo2("McKenzie");
		metodo3 (5);
		metodo4 (1 , 9.5f);
		String[] arreglito = {"a","e","i","o","u"};
		metodo5 (arreglito);
		//métodos con llamados
		llamadaAOtroMetodo();
		
		Integer valorRetornado = retorno1();//no hace nada con el valor retornado
		System.out.println(valorRetornado);//Imprime el valor
		System.out.println(valorRetornado/7); //35/7=5
		System.out.println(valorRetornado/5); //35/5=7
		
		String nombreCompleto = getNombreCompleto("Bárbara", "Pino", "Rojo");
		System.out.println("El nombre completo es: "+nombreCompleto);
	}
	//definición o  estructura de un método
	//void -> el método no retorna ningún valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del método inicial...");
	}
	
	public static void metodo2(String nombre) {
		System.out.println("Hola soy " +nombre);
	}
	
	public static void metodo3(Integer numero) {
		System.out.println("Número " +numero);
	}
	
	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Número " +numero1);
		System.out.println("Número " +numero2);
	}
	
	
	public static void metodo5(String [] arreglito) {//no reconoce el arreglo por sí solo
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));
	}
	
	//funciones con retorno
	
	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos; //pasar el contenido de la variable
		
	}
	/**
	 * Método que une todos los datos
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String getNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
			String nombreCompleto = nombre+ " "+apePaterno+" "+apeMaterno;
			return nombreCompleto; //retornamos el contenido de la variable
	}
	
	//método que llama a otro método
	
	public static void llamadaAOtroMetodo() {
		System.out.println("llamada a otro método desde un método");
		metodo4(1234, 54.3f);
	}
	
}
	


