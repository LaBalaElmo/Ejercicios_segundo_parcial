package observer_memento;

public class Cliente {
	public static void main(String[] args) {
		GitHub github = new GitHub();
		Git git = new Git();

		Codigo codigo;
		
		codigo = new Codigo(2, "Primer commit");
		git.commit(codigo);
		github.addMemento(git.createMemento());
		
		codigo = new Codigo(5, "Segundo commit");
		git.commit(codigo);
		github.addMemento(git.createMemento());
		
		codigo = new Codigo(10, "Tercer commit");
		git.commit(codigo);
		github.addMemento(git.createMemento());
		
		codigo = new Codigo(20, "Cuarto commit");
		git.commit(codigo);
		github.addMemento(git.createMemento());
		
		codigo = new Codigo(35, "Quinto commit");
		git.commit(codigo);
		github.addMemento(git.createMemento());
		
		Respositorio repositorio = new Respositorio();

        Desarrollador user1= new Desarrollador(new Persona("Juan1", 1));
        Desarrollador user2= new Desarrollador(new Persona("Juan2", 2));
        Desarrollador user3= new Desarrollador(new Persona("Juan3", 3));

        repositorio.suscribirse(user1);
        repositorio.suscribirse(user2);
        repositorio.suscribirse(user3);

        repositorio.restaurar(github.getMemento(0));
        
        repositorio.dessuscribirse(user1);
        repositorio.dessuscribirse(user2);
        repositorio.dessuscribirse(user3);
        
        user1= new Desarrollador(new Persona("Juan4", 4));
        user2= new Desarrollador(new Persona("Juan5", 5));
        user3= new Desarrollador(new Persona("Juan6", 6));

        repositorio.suscribirse(user1);
        repositorio.suscribirse(user2);
        repositorio.suscribirse(user3);
        
        repositorio.restaurar(github.getMemento(4));
	}
}
