package aula5;

import java.util.Scanner;

public class ImprimirEmOrdemCres {

	public static void main(String[] args) {
		//Variáveis
		Scanner sc = new Scanner(System.in);
		double num1, num2, num3;
		//Entrada
		System.out.println("Nesse programa vamos analisar 3 números e mostrar em ordem crescente");
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		//Processamento/saída
		if (num1 <= num2 && num1 <= num3) {
			if (num2 < num3) {
				System.out.printf("A ordem é: %.2f, %.2f e %.2f%n", num1, num2, num3);
			} else {
				System.out.printf("A ordem é: %.2f, %.2f e %.2f", num1, num3, num2);
			}
		} else if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3) {
				System.out.printf("A ordem é: %.2f, %.2f e %.2f", num2, num1, num3);
			} else {
				System.out.printf("A ordem é: %.2f, %.2f, e %.2f", num2, num3, num1);
			}
		} else {
			if (num1 <= num2) {
				System.out.printf("A ordem é: %.2f, %.2f e %.2f", num3, num1, num2);
			} else {
				System.out.printf("A ordem é a seguinte: %.2f, %.2f e %.2f", num3, num2, num1);
			}
		}
		sc.close();
	}

}
