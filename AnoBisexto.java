package aula5;

import java.util.Scanner;

public class AnoBisexto {

	public static void main(String[] args) {
		//Variáveis
		Scanner sc = new Scanner(System.in);
		int ano;
		//Entrada
		System.out.println("Olá caro usuário, aqui iremos informar se o ano é bisexto ou não");
		System.out.print("Digite o valor do ano: ");
		ano = sc.nextInt();
		//processamento/saída
		if ((ano % 4 == 0 && ano %100 !=0) || (ano % 400 ==0)) {
			System.out.println("O ano é bisexto");
		} else {
			System.out.println("O ano não é bisexto");
		}
		sc.close();
	}

}
