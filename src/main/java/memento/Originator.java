package memento;

public class Originator {
	private Tesis state;

    public Originator(){}

    public void setState(Tesis state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }
}
