package observer_memento;

public class Persona {
	private String nombre;
	private int id;

	public Persona(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void info() {
		System.out.println("Nombre: " + nombre);
		System.out.println("ID: " + id);
	}

}
