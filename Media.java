package curso_programacao;


import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double notas = 0;
		int x = 1;
		String nome;
		System.out.println("Digite o nome do aluno: ");
		nome = teclado.nextLine();
		
		while(x < 5) {
			System.out.println("Digite a "+ x +"ª nota: ");
			notas += (teclado.nextDouble());
			x += 1;
		}
		System.out.println("Aluno: "+nome+" - Média: "+notas/4 );
		teclado.close();
		

	}

}
