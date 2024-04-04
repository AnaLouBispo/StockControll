package Controller;

import java.util.Scanner;
import Models.Products;



public class ProductRegistration {

	Scanner sc = new Scanner(System.in);

	public void Create() {

		System.out.println("Nome do Produto: ");
		String name = sc.next();
		int id = 0;

		do {
			System.out.println("Qual é o id do Produto: ");
			try {
				id = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Erro de entrada " + e.getMessage());
				sc.next(); // Discard invalid input
			}
		} while (true);

		System.out.println("Descrição: ");
		String desc = sc.next();
		// -------------------------

		int qtd = 0;
		do {
			System.out.println("Quantidade do Produto: ");
			try {
				qtd = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Erro de entrada " + e.getMessage());
				sc.next();
			}
		} while (true);

		// -------------------------

		double price = 0;
		do {
			System.out.println("Preço do Produto: ");
			try {
				price = sc.nextDouble();
				break;
			} catch (Exception e) {
				System.out.println("Erro de entrada " + e.getMessage());
				sc.next();
			}
		} while (true);

		
		Products produto  = new Products(id, desc, name, qtd, price);
		produto.SaveInStock("estoque.txt");
		
		

	}
	
	public static void ListInfo(String fileName) {
		Products list = new Products(0, null, null, 0, 0);
		list.showInfo("estoque.txt");
	}
	

}