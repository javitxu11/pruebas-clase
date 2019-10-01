package pruebasClase2;

public class Persona {

	
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		this.nombre= nombre;
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getNombreCompleto() {
		return apellido+", "+ nombre;
	}
	
	public static void main(String[]args) {
		
		Persona p = new Persona ("Javi","Gonzalez");
		
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
		System.out.println(p.getNombreCompleto());
		
	}
}
