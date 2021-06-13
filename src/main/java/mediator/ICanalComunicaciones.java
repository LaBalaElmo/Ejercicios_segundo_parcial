package mediator;

public interface ICanalComunicaciones {
	void send(String message, Colleague src, Colleague dest);

	void send(String message, Colleague colleague);
}
