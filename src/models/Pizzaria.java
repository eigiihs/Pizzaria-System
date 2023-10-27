package models;

import java.util.ArrayList;

public class Pizzaria {

	private String nome;
	
	private ArrayList<Pizza> Pizzas = new ArrayList<>();
	
	private ArrayList<Motoboy> Motoboys = new ArrayList<>();
	

	public void adicionarPizza (Pizza pizza) {
		
	}
	
	public void listarPizzas() {
		
	}
	
	public void adicionarMotoboy (Motoboy motoboy) {
		
	}
	
	public void listarMotoboys() {
		
	}


	
	//GETTERS AND SETTERS
	
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
