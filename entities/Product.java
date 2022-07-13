package entities;

public class Product {
	//Definindo os atributos da classe Product
	public String name;
	public double price;
	public int quantity;
	
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
