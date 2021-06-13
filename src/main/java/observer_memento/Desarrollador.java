package observer_memento;

public class Desarrollador implements IDesarrollador {
	private Persona persona;

	public Desarrollador(Persona persona) {
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public void update(Memento memento) {
		System.out.println("***********Notificacion***********");
		persona.info();
		memento.getState().info();
	}

}
