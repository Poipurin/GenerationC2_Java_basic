package cl.generation.f20221028;

public class Estudiante {

	Estudiante estudiante = new Estudiante();
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String curso;
	private Integer telefono; 
	private String correo;
	
	
	
	//constructor
	public Estudiante() {
		super();
	}
	
	   //setter and getters


	public Estudiante getEstudiante() {
		return estudiante;
	}



	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}



	public String getRut() {
		return rut;
	}



	public void setRut(String rut) {
		this.rut = rut;
	}
	
	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.rut = curso;
	}



	public Integer getTelefono() {
		return telefono;
	}



	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	
	
	
	
}

