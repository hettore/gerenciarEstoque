package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Para resolver a questão do uso do .
		Scanner sc = new Scanner(System.in); //Para conseguir ler as informações.Lembrar de fechar sc.close()
		
		
		System.out.println("Enter product data: "); //
		System.out.print("Name:");
		String name = sc.nextLine(); //Leitura do nome do produto e ja armazena na variável name
		System.out.print("Price: ");
		double price = sc.nextDouble(); //Leitura do valor e armazena na variável price
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt(); // Leitura da quantidade e armazena na variável quantity
		
		Product product = new Product(name, price, quantity) ; //Não esqueça de importar a classe.
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		
	}

}
