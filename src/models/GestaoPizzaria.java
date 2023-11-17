package models;

import java.util.ArrayList;

public class GestaoPizzaria {

	private static ArrayList<Pizzaria> Pizzarias = new ArrayList<>();
	
	public static void adicionarPizzaria (Pizzaria pizzaria) {
		
		Pizzarias.add(pizzaria);
	}
	
	public static void listarPizzarias() {
		int contador = 1;
		for (Pizzaria pizzaria : Pizzarias) {
			System.out.println(contador + "." + pizzaria.getNome());
			contador++;
		}
	}

	
	//GETTERS AND SETTERS
	
	public ArrayList<Pizzaria> getPizzarias() {
		return Pizzarias;
	}

	public void setPizzarias(ArrayList<Pizzaria> pizzarias) {
		Pizzarias = pizzarias;
	}

    public static void adicionarPizzaria() {
    }

}
