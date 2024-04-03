package lpa;

import java.util.Scanner;

public class Salariosbonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int anos, salario;
		double bonus1,bonus2;
		
		System.out.println("Insira o salário: ");
		salario = ler.nextInt();
		System.out.println("Insira a quantidade de anos na empresa: ");
		anos = ler.nextInt();
		bonus1 = (salario*0.05)+salario;
		bonus2 = (salario*0.07)+salario;
		
		if (anos <= 3) {
			System.out.println("O salário com bonus é "+bonus1);
		}
		else {
			System.out.println("O salario com bonus é: "+bonus2);
		}
		
ler.close();
	}

}
