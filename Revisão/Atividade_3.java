package Revisão;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		 int valor [] = new int[15];
		 int soma=0;
		 
		 for (int i=0; i<15; i++) {
			 System.out.println("Informe um valor: ");
			 valor[i]= ler.nextInt();
			 
			 soma=soma+valor[i];
		 
		  }
		 
		 System.out.println("O resultadoda soma é: " +soma);
	}

}
