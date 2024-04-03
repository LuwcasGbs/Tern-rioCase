package lpa;

import java.util.Scanner;

public class multiploscasososss {

	public static void main(String[] args) {
		double a;
		Scanner ler = new Scanner (System.in);
		System.out.print("Informe um valor: ");
		a = ler.nextDouble();
		
		String mensagem = a %5 ==0 ? "O número é múltiplo de 5" : "O número não é múltiplo de 5";
		System.out.println(mensagem);
ler.close();
	}

}
