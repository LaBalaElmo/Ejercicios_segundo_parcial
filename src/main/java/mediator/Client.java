package mediator;

public class Client {
	public static void main(String[] args) {
		Whatapp mediator = new Whatapp();

		Persona p1 = new Persona(mediator, "Juan1", 1, 23);
		Persona p2 = new Persona(mediator, "Juan2", 2, 10);
		Persona p3 = new Persona(mediator, "Juan3", 3, 15);
		Persona p4 = new Persona(mediator, "Juan4", 4, 3);
		Persona p5 = new Persona(mediator, "Juan5", 5, 45);
		Persona p6 = new Persona(mediator, "Juan6", 6, 25);
		Persona p7 = new Persona(mediator, "Juan7", 7, 23);
		Persona p8 = new Persona(mediator, "Juan8", 8, 57);
		Persona p9 = new Persona(mediator, "Juan9", 9, 45);
		Persona p10 = new Persona(mediator, "Juan10", 10, 35);

		mediator.addUser(p1);
		mediator.addUser(p2);
		mediator.addUser(p3);
		mediator.addUser(p4);
		mediator.addUser(p5);
		mediator.addUser(p6);
		mediator.addUser(p7);
		mediator.addUser(p8);
		mediator.addUser(p9);
		mediator.addUser(p10);

		p1.send("Hola como estas?", p2);
		System.out.println("***");
		p2.send("que tal me encuentro bien , y tu?", p1);
		
		System.out.println("****************");
		p10.send("Hola a todos!");

	}
}
