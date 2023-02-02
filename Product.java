package entities;

public class Product {

	public String nome;
	public Double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome 
				+ ", R$ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ quantidade 
				+ " unidades , Total: R$ " 
				+ String.format("%.2f", valorTotalEstoque());
				
	}
	
}
