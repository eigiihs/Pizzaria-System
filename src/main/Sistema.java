package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import models.GestaoPizzaria;
import models.Motoboy;
import models.Pizzaria;

public class Sistema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean start = true;

		while (start) {

			System.out.println("\nEscolha uma opção:");
			System.out.println("1. Gerenciar Pizzarias");
			System.out.println("2. Gerenciar Motoboys");
			System.out.println("0. Encerrar o Sistema");

			int opc = sc.nextInt();

			switch (opc) {
				case 1:

					boolean gerenciaPizzaria = true;

					while (gerenciaPizzaria) {

						System.out.println("\nEscolha uma opção:");
						System.out.println("1. Adicionar pizzaria");
						System.out.println("2. Ver lista de Pizzarias");
						System.out.println("0. Voltar ao menu principal");

						int opcPizzaria = sc.nextInt();

						switch (opcPizzaria) {
							case 1:
								System.out.println("Informe o nome da pizzaria");
								String nome = sc.next();

								Pizzaria newPizzaria = new Pizzaria();
								newPizzaria.setNome(nome);
								GestaoPizzaria.adicionarPizzaria(newPizzaria);
								System.out.println("Pizzaria adicionada com sucesso!");
								break;
							case 2:

								System.out.println("\nLista de Pizzarias:");
								GestaoPizzaria.listarPizzarias();
								break;
							case 0:
								gerenciaPizzaria = false;
								break;
							default:
								System.out.println("Opção Inválida!!");
								break;
						}
					}

					break;
				case 2:

					boolean gerenciaMotoboy = true;

					while (gerenciaMotoboy) {

						System.out.println("\nEscolha uma opção:");
						System.out.println("1. Adicionar Motoboy");
						System.out.println("2. Ver lista de Motoboys");
						System.out.println("0. Voltar ao menu principal");

						int opcMot = sc.nextInt();

						switch (opcMot) {
							case 1:
								System.out.println("Informe o nome do(a) MotoBoy:");
								String nome = sc.next();
								sc.nextLine();
								System.out.println("Informe a Moto:");
								String moto = sc.nextLine();

								Motoboy newMotoboy = new Motoboy(nome, moto);
								Pizzaria.adicionarMotoboy(newMotoboy);
								System.out.println("MotoBoy adicionado com sucesso!");
								break;
							case 2:
								System.out.println("\nLista de Motoboys:");
								Pizzaria.listarMotoboys();
								break;
							case 0:
								gerenciaMotoboy = false;
								break;
							default:
								System.out.println("Opção Inválida!!");
								break;
						}
					}
					
					break;
				case 0:
					System.out.println("Encerrando o sistema...");
					sc.close();
					System.exit(0);
					break;
				default:
					break;
			}

		}
	}
}
