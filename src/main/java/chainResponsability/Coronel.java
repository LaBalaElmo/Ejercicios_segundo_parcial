package chainResponsability;

public class Coronel implements IEjercito {
	private IEjercito next;

	@Override
	public void setNext(IEjercito handler) {
		this.next = handler;
	}

	@Override
	public IEjercito next() {
		return this.next;
	}

	@Override
	public void darOrden(String orden) {
		if (orden.toLowerCase().equals("desbloqueo") || orden.toLowerCase().equals("manifestacion")) {
			System.out.println("INFO> El coronel se encarga de esta orden");
		} else {
			this.next.darOrden(orden);
		}
	}
}
