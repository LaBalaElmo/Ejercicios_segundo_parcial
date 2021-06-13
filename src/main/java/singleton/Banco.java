package singleton;

public class Banco implements IBanco {
	private static Banco instancia = null;
	private int prestamo = 0;
	private int deuda = 0;
	private IBanco next;

	private Banco() {
		System.out.println("INFO> Inicializando banco");
	}

	public static Banco getInstance() {
		if (instancia == null)
			instancia = new Banco();
		return instancia;
	}

	public void prestarse(int monto) {
		if (prestamo <= deuda) {
			this.prestamo = monto;
			deuda = 0;
		} else {
			this.prestamo = this.prestamo + monto;
		}
	}
	
	public void consultarMontoPagado() {
		System.out.println(deuda);
	}
	
	public void consultarDeuda() {
		System.out.println(prestamo);
	}

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
		Cajero cajero = new Cajero();
		this.setNext(cajero);

		AgenteCredito agenteCredito = new AgenteCredito();
		cajero.setNext(agenteCredito);

		Supervisor supervisor = new Supervisor();
		agenteCredito.setNext(supervisor);

		EncargadoPrestamos encargadoPrestamos = new EncargadoPrestamos();
		supervisor.setNext(encargadoPrestamos);

		deuda = deuda + monto;
		this.next.pagar(deuda * 100 / prestamo);
	}

}
