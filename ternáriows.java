package lpa;

import java.util.Scanner;

public class ternáriows {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idade;
		System.out.print("Insira sua idade: ");
		idade = ler.nextInt();
		String mensagem = idade >= 18 ? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem);
ler.close();
	}

}
