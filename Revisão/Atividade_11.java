package Revisão;

import java.util.Scanner;

public class Atividade_11 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner (System.in);

		int valor [] = new int[20];
		int soma=0;
		int media = 0;
		

		for (int i=0; i<20; i++) {
			System.out.println("Informe a idade: ");
			valor[i]= ler.nextInt();
			
			soma=soma+valor[i];
			
			media=soma/20;

		}

		System.out.println("A media das idades é: " +media);

	}

}
