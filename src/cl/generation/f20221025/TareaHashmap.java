package cl.generation.f20221025;

import java.util.HashMap;

public class TareaHashmap {

	public static void main(String[] args) {
		
		//1.-Definición
		
		HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();
		
		//2.-Agregar valores
		
		capitalCities.put("Bárbara", 29);
	    capitalCities.put("Germany", 30);
	    capitalCities.put("Norway", 10);
	    capitalCities.put("USA", 30);
	    System.out.println(capitalCities);
		
		//3.-Verificar contenido
	    boolean verificacionPais = capitalCities.containsKey("Germany");
	    System.out.println("Existe el país? " +verificacionPais);
	    
	    boolean verificacionCapital = capitalCities.containsValue("Oslo");
	    System.out.println("Existe la ciudad? " +verificacionCapital);
	    
	  //4.- eliminar un elemento por objeto o contenido
	    capitalCities.remove("England");
	    
	    
	  //5.- Tamaño del arreglo
	    
	  //6.- Recorrer 
	}

}
