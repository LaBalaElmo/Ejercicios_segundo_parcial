package chainResponsability;

public interface IEjercito {
	void setNext(IEjercito handler);
	IEjercito next();
    void darOrden(String orden);
}
