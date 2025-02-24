package aula5;

import java.util.Scanner;

public class AprovarReprovar {

	public static void main(String[] args) {
	//variáveis
	Scanner sc = new Scanner (System.in);
	double nota1, nota2, atividades1, atividades2, media1, media2;
	String aluno1, aluno2, Condicao1, Condicao2; 
	//entrada
	System.out.println("Vamos calcular se o aluno passou ou reprovou de ano");
	System.out.print("Digite o nome do primeiro aluno: ");
	aluno1 = sc.nextLine();		
	System.out.print("Dgite a nota do total do primeiro aluno: ");
	nota1 = sc.nextDouble();
	System.out.print("Digite a quantidade total de atividades: ");
	atividades1 = sc.nextDouble();
	sc.nextLine();
	System.out.print("Digite o nome do segundo aluno aluno: ");
	aluno2 = sc.nextLine();	
	System.out.print("Dgite a nota do total do segundo aluno: ");
	nota2 = sc.nextDouble();
	System.out.print("Digite a quantidade total de atividades: ");
	atividades2 = sc.nextDouble();
	//processamento
	media1 = nota1 / atividades1;
	media2 = nota2 / atividades2;
	//pós-processamento
	if (media1 >=7) {
		Condicao1 = "Aprovado";
	} else {
		Condicao1 = "Reprovado";
	}
	if (media2 >=7) {
		Condicao2 = "Aprovado";
	} else {
		Condicao2 = "Reprovado";
	}
	//saida
	System.out.printf("O %s foi %s, sua média foi de %.2f%n", aluno1, Condicao1, media1);
	System.out.printf("O %s foi %s, sua media foi de %.2f%n", aluno2, Condicao2, media2);
	sc.close();
	}

}
