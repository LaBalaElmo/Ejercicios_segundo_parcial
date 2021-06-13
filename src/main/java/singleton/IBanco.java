package singleton;

public interface IBanco {
	void setNext(IBanco handler);

	IBanco next();

	void pagar(int monto);
}
