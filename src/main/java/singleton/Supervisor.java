package singleton;

public class Supervisor implements IBanco {
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
		if (monto > 50 && monto < 100) {
			System.out.println("INFO> El monto pagado es mayor al 50%, cobrado por el supervisor");
			System.out.println("INFO> Ofreciendo nuevo prestamo");
		} else {
			this.next.pagar(monto);
		}
	}
}