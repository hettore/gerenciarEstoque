package entities;

import java.util.Date;

public class Order {

	//modificadores de acesso:
	// private: o mesmbro só pode ser acessado na própria classe.
	// (nada): o membro só pode ser acessado nas classes do mesmo pacote.
	// protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes.
	// public: o membro é acessado por todas as classes (ao menos que ele resida em um modúlo diferente que não exporte o pacote onde ele está.
	
	private Date date;
	private Product product;
	
	//construtor
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV";
	}

	//get set 
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
}
