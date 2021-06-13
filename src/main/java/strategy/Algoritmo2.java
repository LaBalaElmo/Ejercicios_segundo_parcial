package strategy;

import java.util.List;

public class Algoritmo2 implements IAlgoritmo {

	@Override
	public void execute(List<Celular> valor) {
		if (valor.size() > 10) {
			System.out.println("Se esta utilizando el algoritmo de busqueda 2");
			for(Celular celular : valor) {
				celular.info();
			}
		} else {
			System.out.println("Este algoritmo tardara mucho, mus pocos items");
		}
	}

}
