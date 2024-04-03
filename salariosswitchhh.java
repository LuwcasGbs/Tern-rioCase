package lpa;

import java.util.Scanner;

public class salariosswitchhh {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anos;
		double salario, salario1;
		
		System.out.println("Digite o salario: ");
		salario = ler.nextInt();
		
		System.out.println("Digite os anos na empresa: ");
		anos = ler.nextInt();
		
		switch (anos) {
		case 0, 1, 2, 3:
			salario = (salario*0.05)+salario;
		System.out.println("O salário é "+salario);
		break;
		
		default:
			salario1 = (salario*0.07)+salario;
			System.out.println("O salário é "+salario1);
			
		}
ler.close();
	}

}
