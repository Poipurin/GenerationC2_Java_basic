package cl.generation.f20221025;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones o metodos
		//llamar a un método
		nombreMetodo();
		metodo2("Mcgee");
		metodo2("McKenzie");
		metodo3 (5);
		metodo4 (1 , 9.5f);
		String[] vocales = {"a","e","i","o","u"};
		metodo5 (vocales);
		
		

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
		System.out.println("Soy el arreglo " +arreglito);
	}
}
	


