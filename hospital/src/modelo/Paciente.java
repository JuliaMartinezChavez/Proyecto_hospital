package modelo;

public class Paciente {
	String nombre;
	String edad;
	String genero;
	String telefono;
	String alergia;
	
	public Paciente() {}
	
	public Paciente(String nombre,
	String edad,
	String genero,
	String telefono,
	String alergia) {
		this.alergia=alergia;
		this.nombre=nombre;
		this.edad=edad;
		this.telefono=telefono;
		this.genero=genero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAlergia() {
		return alergia;
	}
	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}
	
}
