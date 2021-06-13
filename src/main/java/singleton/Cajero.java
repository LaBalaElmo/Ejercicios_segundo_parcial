package singleton;

public class Cajero implements IBanco {
	private IBanco next;

	@Override
	public void setNext(IBanco handler) {
		this.next = handler;
	}

	@Override
	public IBanco next() {
		return this.next;
	}

	@Override
	public void pagar(int monto) {
		if (monto < 25) {
			// logica // algoritmos
			System.out.println("INFO> El monto pagado es menor al 25%, pagando al cajero");
		} else {
			this.next.pagar(monto);
		}
	}
}
