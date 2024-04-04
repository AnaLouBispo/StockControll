package Models;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Food extends Products {

	LocalDate validade;

	public Food(int id, String name, String desc, int qtd, double price, LocalDate validade) {
		super(id, name, desc, qtd, price);
		this.validade = validade;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}
	

	@Override
	public void SaveInStock(String fileName) {
		
		super.SaveInStock(fileName);
		try {
			FileWriter writer = new FileWriter(fileName, true);
			writer.write(validade + "\n");
		} catch (IOException e) {
			System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
		}
	}
		
	

	@Override
	public String showInfo(String fileName) {
		return super.showInfo(fileName);

	}

}
