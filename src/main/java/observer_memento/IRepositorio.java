package observer_memento;

public interface IRepositorio {
	void suscribirse(IDesarrollador observer);
    void dessuscribirse(IDesarrollador observer);
    void notifyObserver(Memento memento);
}
