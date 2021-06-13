package mediator;

public class Persona extends Colleague {
	private String nombre;
	private int id;
	private int edad;

	public Persona(ICanalComunicaciones mediator, String nombre, int id, int edad) {
		super(mediator);
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void send(String message, Colleague colleague) {
		mediator.send(message, this, colleague);
	}

	@Override
	public void send(String message) {
		mediator.send(message, this);
	}

	@Override
	public void messageReceived(String message) {
		System.out.println("Mensaje recibido por: " + nombre);
		System.out.println("Mensaje: " + message);
		System.out.println("Edad: " + edad);
		System.out.println("ID: " + id);
	}

	@Override
	public void info() {
		System.out.println("Mensaje enviado por: " + nombre);
	}

}
