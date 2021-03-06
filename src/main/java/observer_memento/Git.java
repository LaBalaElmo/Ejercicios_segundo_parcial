package observer_memento;

public class Git {
	private Codigo state;

	public Git(){}

	public void commit(Codigo state) {
		System.out.println("**** Set State *****");
		state.info();
		this.state = state;
	}

	public Memento createMemento() {
		System.out.println("**** Create State *****");
		state.info();
		return new Memento(this.state);
	}

	public void restoreFromMemento(Memento memento) {
		this.state = memento.getState();
		System.out.println("**** State Restored *****");
		this.state.info();
	}
}
