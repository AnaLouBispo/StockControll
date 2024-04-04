package Models;

public class Eletro extends Products {

	private String brand;
	private String model;

	public Eletro(int id, String name, String desc, int qtd, double price, String brand, String model) {
		super(id, name, desc, qtd, price);
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
