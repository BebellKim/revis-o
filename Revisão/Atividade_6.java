package Revisão;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		
		
        int I=0;
        String nome;

		System.out.print("informe o nome :");
		nome = ler.next();

		
		
		while(I < 10) {
			
			I++;
			
			System.out.println("O nome é: " +nome);
		
		}

	}

}
