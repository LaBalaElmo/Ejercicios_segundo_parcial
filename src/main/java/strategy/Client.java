package strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		BuscadorCelular buscador = new BuscadorCelular();

		List<Celular> list = new ArrayList<>();
		list.add(new Celular("S10", "Samsung", "Alta", 200));
		list.add(new Celular("S10", "Samsung", "Alta", 200));
		list.add(new Celular("S10", "Samsung", "Alta", 200));
		list.add(new Celular("S10", "Samsung", "Alta", 200));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		
		
		buscador.setListCelulares(list);

		buscador.setStrategy(new Algoritmo1());
		buscador.buscar();

		buscador.setStrategy(new Algoritmo2());
		buscador.buscar();
		
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		list.add(new Celular("S20", "Samsung", "Alta", 400));
		
		buscador.setStrategy(new Algoritmo1());
		buscador.buscar();

		buscador.setStrategy(new Algoritmo2());
		buscador.buscar();

	}
}
