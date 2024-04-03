package lpa;

import java.util.Scanner;

public class CasosSemana {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Informe o dia da semana (1-7): ");
		int dia = ler.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("O dia escolhido é domingo!");
			break;
		case 2:
			System.out.println("O dia escolhido é segunda..");
			break;
		case 3:
			System.out.println("O dia escolhido é terça.");
			break;
		case 4:
			System.out.println("O dia escolhido é quarta.. :'(");
			break;
		case 5:
			System.out.println("O dia escolhido é quinta.");
			break;
		case 6:
			System.out.println("O dia escolhido é sexta!!!");
			break;
		case 7:
			System.out.println("O dia escolhido é sábado :D");
		default:
			System.out.println("Número escolhido inválido... Por favor selecione outro número.");
		}
ler.close();
	}

}
