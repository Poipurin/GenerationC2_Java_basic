package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		//Polimorfismo
		
		//instancia de las clases
		Mascota mascota = new Mascota();
		mascota.emitirSonido();
		
		Perro ayun = new Perro();
		ayun.emitirSonido();
		
		Gato punto = new Gato();
		punto.emitirSonido();
		
		
		/**********Polimorfismo**************/
		//Una superclase se comporta como una clase hija pero no es la clase hija
		//para que exista el polimorfismo primero debe existir herencia, jerarquía de clase
		System.out.println("");
		
		Mascota profesorMcKenzie = new Perro();//una clase se comporta como otra pero no es la otra
		profesorMcKenzie.emitirSonido();
		System.out.println(profesorMcKenzie.toString());
		
		
		Mascota SrButtons = new Gato();
		SrButtons.emitirSonido();
		
	}

}
