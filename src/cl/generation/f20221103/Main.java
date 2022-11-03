package cl.generation.f20221103;

public class Main {

	public static void main(String[] args) {
		//Objetos de colaboración
		
		Usuario usuario = new Usuario();
		/*ArrayList <String> telefono = new ArrayList <String>();
		String telefonito = "123456789";
		telefono.add(telefonito);
		telefono.add("543452342");
		usuario.setTelefonos(telefono);
		System.out.println(usuario.getTelefonos());	*/
		
		
		usuario.getTelefonos().add ("878757");
		usuario.getTelefonos().add ("821357");
		usuario.getTelefonos().add ("823217");
		System.out.println(usuario.getTelefonos());
		
		/*Direccion direccion = new Direccion();
		direccion.setCalle("Pio");
		direccion.setNumero("235432");
		direccion.setRegion("Juads");
		
		usuario.setDireccion(direccion);*/
		//forma limpia
		usuario.getDireccion();
		System.out.println(usuario.getDireccion().toString());
	}

}
