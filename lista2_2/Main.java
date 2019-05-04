package lista2_2;

import java.util.Scanner;

public class Main {

	public static String reverteString(String a) {
		String saida = new String();
		for (int i = a.length() - 1; i >= 0; i--) {
			saida += a.charAt(i);
		}
		return saida;
	}
	
	public static void main(String[] args) {
		
		String frase = "";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite uma frase: ");
		frase = teclado.nextLine();
		
		frase = reverteString(frase);
		System.out.println(frase);
		
		teclado.close();
		
	}
	
}
