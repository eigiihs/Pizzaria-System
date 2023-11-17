package models;

import java.util.ArrayList;

public class Pizzaria {

	private String nome;

	private ArrayList<Motoboy> Motoboys = new ArrayList<>();

	private ArrayList<Pizza> Pizzas = new ArrayList<>();

	public void adicionarPizza(Pizza pizza) {

		Pizzas.add(pizza);
	}

	public void listarPizzas() {
		if (Pizzas.size() <= 0) {
			System.out.println("Nenhuma pizza encontrada!!");
		} else {
			int contador = 1;
			for (Pizza pizza : Pizzas) {
				System.out.println(contador + ". Sabor: " + pizza.getSabor() + ", Preço: " + pizza.getPreco());
				contador++;
			}
		}
	}

	public void adicionarMotoboy(Motoboy motoboy) {

		Motoboys.add(motoboy);
	}

	public void listarMotoboys() {
		if (Motoboys.size() <= 0) {
			System.out.println("Nenhum motoboy encontrado!!");
		} else {
			int contador = 1;
			for (Motoboy m : Motoboys) {
				System.out.println(contador + ". Nome: " + m.getNome() + ", Moto: " + m.getMoto());
				contador++;
			}
		}
	}

	// GETTERS AND SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Pizza> getPizzas() {
		return Pizzas;
	}

	public void setPizzas(ArrayList<Pizza> pizzas) {
		Pizzas = pizzas;
	}

	public ArrayList<Motoboy> getMotoboys() {
		return Motoboys;
	}

	public void setMotoboys(ArrayList<Motoboy> motoboys) {
		Motoboys = motoboys;
	}
}
