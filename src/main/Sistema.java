package main;

import java.util.Locale;
import java.util.Scanner;

import models.GestaoPizzaria;
import models.Motoboy;
import models.Pizza;
import models.Pizzaria;

public class Sistema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Instanciando um novo objeto da classe GestaoPizzaria
		GestaoPizzaria newGestao = new GestaoPizzaria();

		do {

			System.out.println("\n----- Bem Vindo ao nosso Sistema -----");
			System.out.println("Escolha uma opção:");
			System.out.println("1. Adicionar Pizzaria");
			System.out.println("2. Ver lista de Pizzarias");
			System.out.println("3. Gerenciar Pizzaria");
			System.out.println("0. Encerrar o Sistema");
			System.out.println("--------------------------------------");

			int opc = sc.nextInt();

			switch (opc) {
				case 1:
					System.out.println("\nInforme o nome da pizzaria");
					sc.nextLine();
					String nomePizzaria = sc.nextLine();

					//Instanciando um novo objeto da classe Pizzaria
					Pizzaria newPizzaria = new Pizzaria();
					//Adicionando o nome da Pizzaria na instancia newPizzaria
					newPizzaria.setNome(nomePizzaria);
					//Adicionando a newPizzaria na lista de Pizzarias dentro da classe GestaoPizzaria
					newGestao.adicionarPizzaria(newPizzaria);
					System.out.println("\nPizzaria adicionada com sucesso!");
					break;
				case 2:
					System.out.println("\n---- Lista de Pizzarias ----");
					//Listando as pizzarias na Instancia da classe GestaoPizzaria
					newGestao.listarPizzarias();
					break;
				case 3:
					System.out.println("\n---- Lista de Pizzarias ----");
					newGestao.listarPizzarias();

					System.out.println("\nDigite o número da pizzaria que deseja gerenciar:");
					int idPizzaria = sc.nextInt();

					//Verificando se o id da Pizza é existente (maior que 0 e menor que o tamanho da lista)
					if (idPizzaria > 0 && idPizzaria <= newGestao.getPizzarias().size()) {
						//Criando variável escolPizzaria que armazena o item correspondente ao id da lista Pizzarias criada na classe GestaoPizzaria
						Pizzaria escolPizzaria = newGestao.getPizzarias().get(idPizzaria - 1);

						boolean gestaoPizzaria = true;

						while (gestaoPizzaria) {

							System.out.println("\n---- Gerenciando a Pizzaria: " + escolPizzaria.getNome() + " ----");
							System.out.println("1. Adicionar pizza ao menu");
							System.out.println("2. Ver menu de pizzas");
							System.out.println("3. Adicionar Motoboy");
							System.out.println("4. Ver lista de Motoboys");
							System.out.println("0. Voltar");

							int opcGestaoPizzar = sc.nextInt();

							switch (opcGestaoPizzar) {
								case 1:
									System.out.println("\nDigite o sabor da pizza:");
									sc.nextLine();
									String sabor = sc.nextLine();

									System.out.println("Digite o valor da pizza:");
									sc.useLocale(Locale.US);
									while (!sc.hasNextDouble()) {
										System.out.println("Valor inválido! Digite o valor da pizza novamente. Utilize '.' para separação decimal:");
										sc.next();  // Consumir a entrada inválida, para evitar um loop infinito
									} 
									double preco = sc.nextDouble();
									sc.nextLine();

									//Instanciando um novo objeto da classe Pizza
									Pizza newPizza = new Pizza(sabor, preco);
									//Adicionando a nova pizza na pizzaria escolhida de acordo com o id
									escolPizzaria.adicionarPizza(newPizza);
									System.out.println("\nPizza adicionada com sucesso!!");
									break;
								case 2:
									System.out.println("\n---- Menu de Pizzas ----");
									escolPizzaria.listarPizzas();
									break;
								case 3:
									System.out.println("\nInforme o nome do(a) MotoBoy:");
									sc.nextLine();
									String nome = sc.nextLine();
									
									System.out.println("Informe a Moto:");
									String moto = sc.nextLine();

									//Instanciando um novo objeto da classe Motoboy
									Motoboy newMotoboy = new Motoboy(nome, moto);
									//Adicionando o novo motoboy na pizzaria escolhida de acordo com o id
									escolPizzaria.adicionarMotoboy(newMotoboy);
									System.out.println("\nMotoBoy adicionado com sucesso!!");
									break;
								case 4:
									System.out.println("\n---- Lista de Motoboys ----");
									escolPizzaria.listarMotoboys();
									break;
								case 0:
									gestaoPizzaria = false;
									break;
								default:
									System.out.println("Opção Inválida!!");
									break;
							}
						}

					} else {
						System.out.println("Pizzaria não existente!");
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

		} while (true);

	}
}
