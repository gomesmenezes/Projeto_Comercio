package fase1Comercio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Comercio comercio = new Comercio();
		int opcao = 0;
		while(opcao != 6) {
			System.out.println();
			System.out.println("1) Listar todos os produtos\r\n"
							+ "2) Cadastrar um novo produto\r\n"
							+ "3) Adicionar estoque de um produto\r\n"
							+ "4) Remover um produto do comércio\r\n"
							+ "5) Vender algum produto existente\r\n"
							+ "6) Sair do programa\n"); 
			System.out.print("Qual opcao desejada? ");
			opcao = Integer.parseInt(sc.nextLine());
			if (opcao == 1) {
				comercio.listarProduto();
			}
			else if(opcao == 2) {
				comercio.cadastrarProduto();
			}
			else if(opcao == 3) {
				comercio.adicionaEstoque();
			}
			else if(opcao == 4) {
				comercio.removeProduct();
			}
			else if(opcao == 5) {
				comercio.sellProduct();
			}
			else if(opcao == 6) {
				comercio.exitProgram();
			}
		}
		sc.close();
	}

}
