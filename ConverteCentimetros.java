package converteCentimetros;

import java.util.Scanner;

public class ConverteCentimetros {

	public static void main(String[] args) {
		
		
		System.out.println("Digite o valor em metros");
		
		Scanner input = new Scanner(System.in);
		
		double metros = input.nextDouble();
		
		double conversao = metros*100;
		
		System.out.println("O valor em centímetros é: " + conversao);
		
		
		input.close();

	}

}
