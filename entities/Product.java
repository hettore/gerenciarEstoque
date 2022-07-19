package entities;

public class Product {
	//Definindo os atributos da classe Product
	private String name;
	private double price;
	private int quantity;
	
	//Usando construtor
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		//this.quantity = 0  não é necessario o uso pq por paremetro essa variavel ja é inicializada com 0
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	//Definindo os métodos
	//operação para devolver o valor total do estoque
	public double totalValueInStock() {
		return price * quantity;
	}
	
	//Operação para adicionar produtos ao estoque.
	//Usamos o this para referenciar o atributo da classe e não o parametro da função.
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	//Operação para remover produto do estoque.
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	//Operação para converter o objeto para string, sobreposição 
	public String toString() {
		return name
				+ ", $"
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
				
				
	}
}
