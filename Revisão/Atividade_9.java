package Revisão;

import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
       
		double idade; 
		int i = 1;  
		double soma = 0;
	
		
		while (i <= 20) {
			
			i++;
			
			System.out.print("informe a idade :");
			idade = ler.nextDouble();
			
			soma += idade;
			
			System.out.println("A soma é "+ soma);
			}
			
			System.out.println(" A soma final das idades é "+ soma);
		}
		
	}


