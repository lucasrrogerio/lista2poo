package lista2_1;

import java.util.Scanner;

public class Main {
	
	public static double getMediaAluno(double a, double b) {
		return (a+b)/2;
	}
	
	public static String getStatusAluno(double m) {
		if (m > 6) {
			return "Aprovado.";
		} else if (m < 4) {
			return "Reprovado.";
		} else {
			return "Verifica��o Suplementar.";
		}
		
	}
	
	public static void main(String[] args) {
		
		double p1, p2, media;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a nota da p1 e da p2 (use espa�o entre elas): ");
		p1 = teclado.nextDouble();
		p2 = teclado.nextDouble();
		media = getMediaAluno(p1, p2);
		
		System.out.println("M�dia: "+media);
		System.out.println("Status: "+getStatusAluno(media));
		teclado.close();
		
	}

}