package lpa;

import java.util.Scanner;

public class casosSemanais {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Selecione um dia da semana: ");
		String dia = ler.next();
		
		switch (dia) {
		case ("domingo"):
			System.out.println("O dia é 1");
		break;
		
		case ("segunda"):
			System.out.println("O dia é 2");
		break;
		
		case ("terça"):
			System.out.println("O dia é 3");
		break;
		
		case ("quarta"):
			System.out.println("O dia é 4");
		break;
		
		case ("quinta"):
			System.out.println("O dia é 5");
		break;
		
		case ("sexta"):
			System.out.println("O dia é 6");
		break;
		
		case ("sabado"):
			System.out.println("O dia é sábado");
		default:
			System.out.println("Dia inválido");
			break;
		}
		ler.close();
	}

}
