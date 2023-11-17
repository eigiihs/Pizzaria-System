package models;

public class Pizza {

	private String sabor;
	private double preco;
	
	public Pizza(String sabor, double preco) {
		this.sabor = sabor;
		this.preco = preco;
	}
	
		
	//GETTERS AND SETTERS
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
