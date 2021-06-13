package mediator;

import java.util.ArrayList;
import java.util.List;

public class Whatapp implements ICanalComunicaciones {
	private List<Colleague> colegas = new ArrayList<>();

	public void addUser(Colleague user) {
		colegas.add(user);
	}

	@Override
	public void send(String message, Colleague src, Colleague dest) {
		for (Colleague colega : colegas) {
			if (colega.equals(dest)) {
				src.info();
				colega.messageReceived(message);
			}
		}
	}

	@Override
	public void send(String message, Colleague colleague) {
		for (Colleague colega : colegas) {
			if(!colleague.equals(colega)) {
				colega.messageReceived(message);
			}
		}
	}

}
