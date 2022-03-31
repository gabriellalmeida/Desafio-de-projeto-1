import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao = 0;
		
		Cliente titular = new Cliente();
		Conta cc = new ContaCorrente(titular);
		Conta poupanca = new ContaPoupanca(titular);
		
		
		System.out.println("------- Olá! Bem-vindo ao Bando JAVA -------\n\nPara iniciarmos, digite o nome do titular: ");
		String nome = scan.next();
		titular.setNome(nome);
		
		Main.menu(nome, opcao, cc, poupanca);
		
	}
	
	private static int menu(String nome, int opcao, Conta cc, Conta poupanca) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\n1 - Deposito\n2 - Saque\n3 - Transferencia\n4 - Extrato");
		System.out.println(nome + " escolha uma das operações: ");
		opcao = scan.nextInt();
		
		return Main.escolha(nome, opcao, cc, poupanca);
		
	}

	private static int escolha(String nome, int opcao, Conta cc, Conta poupanca) {
		
		Scanner scan = new Scanner(System.in);
		
		int tipoconta;
		
		switch (opcao) {
		case 1:
			System.out.println("\n\nQual tipo de conta deseja depositar?\n1 - Conta Corrente\n2 - Conta Poupança ");
		 	tipoconta = scan.nextInt();
		 	if (tipoconta == 1) {
		 		System.out.print("\nDigite o valor a depositar na conta corrente: R$");
		 		double valor = scan.nextDouble();
		 		cc.depositar(valor);
		 		System.out.println("\n------- Deposito realizado! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("------- Operação finalizada! -------"); break;
				} else {
					System.out.println("------- Opção invalida! ------- \n------- Operação finalizada -------"); break;
				}
				
		 	} else if (tipoconta == 2) {
		 		System.out.print("\nDigite o valor a depositar na conta poupança: R$");
		 		double valor = scan.nextDouble();
		 		poupanca.depositar(valor);
		 		System.out.println("\n------- Deposito realizado! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("Operação finalizada!"); break;
				} else {
					System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
				}
		 		
		 	} else {
		 		System.out.println("\n------- Opção invalida! -------\n------- Tente novamente -------");
		 		Main.menu(nome, 0, cc, poupanca);
		 	}
		 	
		case 2:
			System.out.println("\n\nQual tipo de conta deseja sacar?\n1 - Conta Corrente\n2 - Conta Poupança ");
		 	tipoconta = scan.nextInt();
		 	if (tipoconta == 1) {
		 		System.out.print("\nDigite o valor a sacar na conta corrente: R$");
		 		double valor = scan.nextDouble();
		 		cc.sacar(valor);
		 		System.out.println("\n------- Saque realizado! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("------- Operação finalizada! -------"); break;
				} else {
					System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
				}
				
		 	} else if (tipoconta == 2) {
		 		System.out.print("\nDigite o valor a sacar na conta poupança: R$");
		 		double valor = scan.nextDouble();
		 		poupanca.sacar(valor);
		 		System.out.println("\n------- Saque realizado! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
						System.out.println("------- Operação finalizada! -------"); break;
					} else {
					System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
					}
		 	} else {
		 		System.out.println("\n------- Opção invalida! -------\n------- Tente novamente -------");
		 		Main.menu(nome, 0, cc, poupanca);
		 	}
		 		
		case 3:
		 	System.out.println("\n\nQual tipo de transferencia deseja realizar?\n1 - Conta Corrente -> Poupança\n2 - Conta Poupança -> Corrente");
		 	tipoconta = scan.nextInt();
		 	if (tipoconta == 1) {
		 		System.out.print("\nDigite o valor a transferir: R$");
		 		double valor = scan.nextDouble();
		 		cc.transferir(valor, poupanca);
		 		System.out.println("\n------- Transferencia realizada! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("------- Operação finalizada! -------"); break;
				} else {
					System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
				}
				
		 	} else if (tipoconta == 2) {
		 		System.out.print("\nDigite o valor a transferir: R$");
		 		double valor = scan.nextDouble();
		 		poupanca.transferir(valor, cc);
		 		System.out.println("\n------- Transferencia realizada! -------");
		 		System.out.println("1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("------- Operação finalizada! -------"); break;
				} else {
					System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
				}
		 	} else {
		 		System.out.println("\n------- Opção invalida! -------\n------- Tente novamente -------");
		 		Main.menu(nome, 0, cc, poupanca);
		 	}
		 	
		case 4:
			System.out.println("\n\n");
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
			
			System.out.println("\n\n1 - Retornar menu\n2 - Finalizar");
				int f = scan.nextInt();
				if (f == 1) {
					Main.menu(nome, 0, cc, poupanca);
				} else if (f == 2) {
					System.out.println("------- Operação finalizada! -------"); break;
				} else System.out.println("------- Opção invalida! -------\n------- Operação finalizada -------"); break;
		default:
			System.out.println("\n------- Opção invalida! -------\nEscolha novamente:");
			Main.menu(nome, 0, cc, poupanca);
		}
		return opcao;
	}
	
}

