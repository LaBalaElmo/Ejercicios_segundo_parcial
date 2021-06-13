package singleton;

public class AgenteCredito implements IBanco {
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
		if (monto >= 25 && monto <= 50) {
			// logica // algoritmos
			System.out.println("INFO> El monto pagado esta entre 25% y 50%, atendido por el agente de credito");
			System.out.println("INFO> Ofreciendo refinanciacion del pestamo");
		} else {
			this.next.pagar(monto);
		}
	}
}
