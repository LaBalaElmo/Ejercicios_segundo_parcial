package strategy;

import java.util.List;

public class BuscadorCelular {
	private List<Celular> valor;

	private IAlgoritmo strategy;

	public BuscadorCelular() {
	}

	public IAlgoritmo getStrategy() {
		return strategy;
	}

	public void setStrategy(IAlgoritmo strategy) {
		this.strategy = strategy;
	}
	
	public void setListCelulares(List<Celular> valor) {
		this.valor = valor;
	}

	public void buscar() {
		this.strategy.execute(valor);
	}
}
