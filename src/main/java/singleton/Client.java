package singleton;

public class Client {
	public static void main(String[] args) {
		Banco banco = Banco.getInstance();
		
		banco.prestarse(100);
		
		banco.pagar(24);
		banco.pagar(10);
		banco.pagar(40);
		banco.pagar(26);
		
	}
}
