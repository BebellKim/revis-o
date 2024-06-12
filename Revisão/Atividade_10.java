package Revisão;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20];
		int soma=0;

		for (int i=0; i<20; i++) {
			System.out.println("Informe a idade: ");
			valor[i]= ler.nextInt();

			soma=soma+valor[i];

		}

		System.out.println("O resultado da soma das idades é: " +soma);
	}

}
