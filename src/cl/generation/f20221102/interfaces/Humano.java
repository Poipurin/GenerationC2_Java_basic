package cl.generation.f20221102.interfaces;

public class Humano extends Omnívoro implements Genérico{
private boolean razonamiento;

public Humano(boolean razonamiento) {
	super();
	this.razonamiento = razonamiento;
}

public Humano() {
	super();
}

public boolean isRazonamiento() {
	return razonamiento;
}

public void setRazonamiento(boolean razonamiento) {
	this.razonamiento = razonamiento;
}

@Override
public void respirar() {
		
}

@Override
public void comer() {
	System.out.println("El humano come de todo, se la come sjsjs");	
}


}
