package strategy;

import java.util.List;

public class Algoritmo1 implements IAlgoritmo {

	@Override
	public void execute(List<Celular> valor) {
		if (valor.size() < 11) {
			System.out.println("Se esta utilizando el algoritmo de busqueda 1");
			for (Celular celular : valor) {
				celular.info();
			}
		} else {
			System.out.println("Demasiados items para utilizar este algoritmo");
		}
	}

}
