package models;

import java.util.ArrayList;

public class GestaoPizzaria {

	private ArrayList<Pizzaria> Pizzarias = new ArrayList<>();

	public void adicionarPizzaria(Pizzaria pizzaria) {

		Pizzarias.add(pizzaria);
	}

	public void listarPizzarias() {
		if (Pizzarias.size() <= 0) {
			System.out.println("Nenhuma pizzaria encontrada!!");
		} else {
			int contador = 1;
			for (Pizzaria pizzaria : Pizzarias) {
				System.out.println(contador + "." + pizzaria.getNome());
				contador++;
			}
		}
	}

	// GETTERS AND SETTERS

	public ArrayList<Pizzaria> getPizzarias() {
		return Pizzarias;
	}

	public void setPizzarias(ArrayList<Pizzaria> pizzarias) {
		Pizzarias = pizzarias;
	}

}
