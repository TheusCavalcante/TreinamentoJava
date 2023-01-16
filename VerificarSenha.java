package curso_programacao;

import java.util.Scanner;

public class VerificarSenha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String senha = "123ABC";
		boolean verif = false;
		System.out.println("Digite sua senha: ");
		String s1 = teclado.nextLine();
		while(verif == false) {
			if(senha.equals(s1)) {
				System.out.println("Senha verificada, seja bem vindo!");
				verif = true;
			}
			else {
				System.out.println("Senha incorreta, tente novamente: ");
				s1 = teclado.nextLine();
			}
			
		}teclado.close();
		

	}

}
