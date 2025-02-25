package a;

import java.util.Scanner;

public class DesafioAdivinhacao {

	public static void main(String[] args) {
		//Variáveis
		Scanner sc = new Scanner(System.in);
		int palpite, numsecret, tentativas = 0;
		numsecret = (int) (Math.random()*100) + 1;
		//Entrada
		System.out.println("Seja bem vindo caro usuário!");
		System.out.println("Vamos jogar um jogo de advinhação, tente advinhar o número entre 1 e 100");
		//Processamento/Saída
		do {
			System.out.print("Insira seu palpite: ");
			palpite = sc.nextInt();
			tentativas ++;
		if (palpite < numsecret) {
			System.out.println("Errou, tente outro número mais alto!");
		} else if (palpite > numsecret) {
			System.out.println("Errou novamente, tente outro número mais baixo!");
		} else {
			System.out.println("Você acertou caro usuário, meus parabéns!!");
			System.out.println("Você levou " + tentativas + " para acertar");
		}	
		} while (palpite != numsecret);
		sc.close();
	}

}
