package curso_programacao;

import java.util.Scanner;

public class Posneg {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor numerico: ");
		int num = teclado.nextInt();
		if(num >= 0) {
			System.out.println("O número digitado é positivo!");
		}
		else {
			System.out.println("O numero digitado é negativo!");
		}
		teclado.close();

	}

}
