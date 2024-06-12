package Revisão;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double numero, X=1;
		int soma=0;
		
		while (X <= 10) {
			
		X++;
		
		System.out.print("informe o número :");
		numero = ler.nextDouble();
		
		soma += numero;
		
		System.out.println("A soma é "+ soma);
		}
		
		System.out.println(" A soma final dos números é "+ soma);
	}

}
