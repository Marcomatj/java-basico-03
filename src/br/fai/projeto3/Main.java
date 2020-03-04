package br.fai.projeto3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		Scanner ler = new Scanner(System.in);
		int idade = 0;
		System.out.println("Digite uma idade: ");

		idade = ler.nextInt();
		while (idade > 0) {
			if (idade > 20) {
				System.out.println("Idade maior que 20.");
			} else {
				if (idade > 12 && idade < 17) {
					System.out.println("Idade maior que 12 e menor que 17.");
				} else {
					if (idade == 7 || idade < 5) {
						System.out.println("Idade igual a 7 ou menor que 5.");
					} else {
						System.out.println("Outras combina��es.");
					}
				}
			}
			System.out.println("Digite uma idade: ");
			idade = ler.nextInt();
		}
	}
}

/*
 * Criar um projeto que: Receba uma idade Exiba a mensagem �Idade maior que 20�,
 * caso seja maior que 20 Exiba a mensagem �Idade maior que 12 e menor que 17�,
 * caso esteja entre 12 e 17 Exiba a mensagem �Idade igual a 7 OU menor que 5�,
 * caso seja igual a 7 ou menor que 5 Exiba a mensagem �Outras combina��es�,
 * caso seja diferente de todos os anteriores
 */
