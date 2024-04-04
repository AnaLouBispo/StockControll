package Models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Products {

	private int id;
	private String name;
	protected String desc;
	private int qtd;
	private double price;

	public Products(int id, String name, String desc, int qtd, double price) {

		this.id = id;
		this.name = name;
		this.desc = desc;
		this.qtd = qtd;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String showInfo(String fileName) {
		StringBuilder conteudo = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String linha;

			while ((linha = reader.readLine()) != null) {
				conteudo.append(linha).append("\n");
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler ao arquivo" + e.getMessage());

		}
		System.out.println(conteudo);
		return conteudo.toString();

	}

	public void SaveInStock(String fileName) {

		String name = getName();
		int id = getId();
		String desc = getDesc();
		int qtd = getQtd();
		double price = getPrice();

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {

			writer.write(name + "\n" + id + "\n" + desc + "\n" + price + "\n" + qtd + "\n");
		} catch (IOException e) {
			// Mensagem de erro caso alguma exception seja encontrada
			System.out.println("Erro ao escrever no arquivo:  " + e.getMessage());
		}

	}

}
