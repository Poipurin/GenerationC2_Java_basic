package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		//instancia de clase
		Auto auto1 = new Auto(); //creación de una variable de tipo Auto//inicializando la instancia// (); ->constructor vacío de auto en este caso
		//asiganr valores a los atributos privados
		//solo a través del método setter
		auto1.setColor("gris");
		auto1.setMarca("Mercedes-Benz");
		auto1.setModelo("Clase G");
		
		//consultar el cotenido de los atributos
		
		
		System.out.println(auto1.getColor());
		System.out.println(auto1.getCilindrada());
		
		//saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de auto
		Auto car = new Auto("Jeep", "Gris carbón", "Rubicon", 1.6f, 10.0f, 240f );
		System.out.println(car.getModelo());
		
		
		System.out.println(car.toString());
		
	}

}
