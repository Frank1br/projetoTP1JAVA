package br.edu.fatecpg.projetojavatp1;

import java.util.Scanner;

public class CalculadoraBasica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		double n1 = scan.nextInt();
		
		System.out.println("Digite o primeiro numero");
		double n2 = scan.nextInt();
		
		double calcSoma = (n1 + n2);
		double calcSub = (n1 - n2);
		double calcMult = (n1 * n2);
		double  calcDiv = (n1/n2);
		
		System.out.println("o resultado da soma é: " + calcSoma);
		System.out.println("o resultado da subtração é: " + calcSub);
		System.out.println("o resultado da multiplicação é: " + calcMult);
		System.out.println("o resultado da divisão é: " + calcDiv);

	}

}
