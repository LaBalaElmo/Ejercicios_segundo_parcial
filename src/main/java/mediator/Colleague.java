package mediator;

public abstract class Colleague {
	protected ICanalComunicaciones mediator;

	public Colleague(ICanalComunicaciones mediator) {
		this.mediator = mediator;
	}

	public abstract void send(String message, Colleague colleague);

	public abstract void send(String message);

	public abstract void messageReceived(String message);
	
	public abstract void info();
}
