package memento;

import java.util.HashMap;
import java.util.Map;

public class DataBase {
	private Map<String, Memento> stateSaved = new HashMap<>();

	public void addMemento(String version, Memento memento) {
		stateSaved.put(version, memento);
	}

	public Memento getMemento(String version) {
		return stateSaved.get(version);
	}
}
