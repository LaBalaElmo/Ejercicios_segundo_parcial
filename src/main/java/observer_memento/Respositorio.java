package observer_memento;

import java.util.ArrayList;
import java.util.List;

public class Respositorio implements IRepositorio {
	private List<IDesarrollador> desarrolladores = new ArrayList<>();
	
	public void restaurar(Memento memento) {
		notifyObserver(memento);
	}

	@Override
	public void suscribirse(IDesarrollador observer) {
		desarrolladores.add(observer);
	}

	@Override
	public void dessuscribirse(IDesarrollador observer) {
		desarrolladores.remove(observer);
	}

	@Override
	public void notifyObserver(Memento memento) {
		for (IDesarrollador desarrollador : desarrolladores) {
			desarrollador.update(memento);
		}
	}
}
