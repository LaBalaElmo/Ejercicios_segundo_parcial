package observer_memento;

import java.util.ArrayList;
import java.util.List;

public class GitHub {
    private List<Memento> stateSaved= new ArrayList<>();

    public void addMemento(Memento memento){
        stateSaved.add(memento);
    }

    public Memento getMemento(int statePosition){
        return stateSaved.get(statePosition);
    }
}
