package aula5;

import java.util.Scanner;

public class ReceberNumImprimirMaior {

	public static void main(String[] args) {
		//variáveis
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		//entrada
		System.out.println("Nesse programa vamos receber dois números e vamos mostrar o maior");
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		//processamento
		if (num1 > num2) {
			System.out.println("o maior número é o " + num1);
		} else {
			System.out.println("O maior número é o número " + num2);
		}
		//saida
		sc.close();
	}

}
