package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Cadastro de produto");
		System.out.println();
		
		Product product = new Product();
		System.out.println("Insira os dados do produto: ");
		System.out.print("Nome: ");
		product.nome = sc.nextLine();
		System.out.print("Valor: ");
		product.preco = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		product.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto cadastrado: " + product);
		
		do {
		System.out.println();
		System.out.println("Deseja adicionar ou remover este item do estoque?");
		System.out.print("Digite 1 para adicionar, 2 para remover ou 0 para sair: ");
		x = sc.nextInt();
		
		switch (x) {
		case 1:
		System.out.println();
		System.out.print("Entre com o número de produtos para adcionar em estoque: ");
		int quantidade = sc.nextInt();
		product.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
	
		break;
		case 2:
		System.out.println();
		System.out.print("Entre com o número de produtos para remover do estoque: ");
		quantidade = sc.nextInt();
		product.removeProduto(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + product);
		break;
		case 0:
			System.out.println("Finalizado");
			break;
		default:
			System.out.println();
			System.out.println("Digite uma das opções válidas");
		}
		} while (x !=0);
			
		sc.close();
	}

}
