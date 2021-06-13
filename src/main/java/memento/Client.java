package memento;

public class Client {
	public static void main (String [] args){
        DataBase data= new DataBase();
        Originator originator= new Originator();

        Tesis tesis;

        tesis= new Tesis("Investigacion de patrones de diseño", 1);
        originator.setState(tesis);
        data.addMemento("version 1",originator.createMemento());

        tesis= new Tesis("Investigacion de patrones de diseño", 2);
        originator.setState(tesis);
        data.addMemento("version 2",originator.createMemento());
        
        tesis= new Tesis("Investigacion de patrones de diseño", 3);
        originator.setState(tesis);
        data.addMemento("version 3",originator.createMemento());
        
        tesis= new Tesis("Patrones de diseño", 4);
        originator.setState(tesis);
        data.addMemento("version 4",originator.createMemento());
        
        tesis= new Tesis("Patrones de diseño", 5);
        originator.setState(tesis);
        data.addMemento("version 5",originator.createMemento());

        originator.restoreFromMemento(data.getMemento("version 3"));
    }
}
