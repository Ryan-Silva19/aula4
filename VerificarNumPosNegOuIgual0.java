package a;

import java.util.Scanner;

public class VerificarNumPosNegOuIgual0 {

	public static void main(String[] args) {
		//variáveis
		Scanner sc = new Scanner(System.in);
		double num;
		String condition;
		//entrada
		System.out.println("Olá caro usuário, nesse programa vamos analisar um número que você digitar e vamos dizer se é positivo, negativo ou igual a zero.");
		System.out.print("Insera um número de sua preferência: ");
		num = sc.nextDouble();
		//processamento 
		if (num > 0) { 
			condition = "um número positivo";
		} else if (num < 0) {
			condition = "um número negativo";
		} else {
			condition = "igual a 0";
		}
		//saída
		System.out.printf("O número %.2f é %s", num, condition);
		sc.close();
	}

}
