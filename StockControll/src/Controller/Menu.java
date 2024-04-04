package Controller;

import java.util.Scanner;



public class Menu {

	static Scanner sc = new Scanner(System.in);

	
	public static void menu() {
		 ElectroRegistration eletro = new ElectroRegistration();
		FoodRegistration food = new FoodRegistration();
		ProductRegistration product =  new ProductRegistration();
		
		do {
			System.out.println("====== Menu Cadastro de Produto ======");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Sair");
			System.out.print("Escolha uma opção: ");
			
			int op = sc.nextInt();
			
			switch (op) {
            case 1:
                System.out.println("Qual produto Cadastrar ");
                System.err.println("- Eletro");
                System.out.println("- Comida");
                System.out.println("- Produto");
                String resp =sc.next().toLowerCase();
               if(resp.equals("eletro")) {
            	  
            	   eletro.Create();
            	   
               }else if(resp.equals("comida")) {
            	   
            	   food.Create();
               }else {
            	  
            	   product.Create();
               }
                
                break;
            case 2:
                System.out.println("Listar Estoque");
                ProductRegistration.ListInfo("estoque.txt");
               
                break;
            case 3:
               
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
			
			
			
		}while(true);
		
		
	}

}
