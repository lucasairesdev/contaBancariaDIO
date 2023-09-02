package contaBancaria;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			
		String nomeCliente;
		String agenciaConta;
		String numeroConta;
		Double saldoConta = 998.0;
		
		System.out.println("Informe a seu nome: ");
		nomeCliente = scan.next();
		scan.nextLine();
		
		System.out.println("Informe sua agencia: ");
		agenciaConta = scan.next();
		scan.nextLine();
		
		System.out.println("Informe sua conta: ");
		numeroConta = scan.next();
		scan.nextLine();
		
		System.out.println("Seu saldo é: " + saldoConta +" Pressione enter para continuar!");
		scan.nextLine();
		
		
		
		System.out.println("\"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + " e seu saldo de " + saldoConta + " já está disponível para saque\".");
	}
}
