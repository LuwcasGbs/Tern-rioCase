package lpa;

import java.util.Scanner;

public class Notascausadoras {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = ler.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = ler.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.println("A média das notas é "+media);
		
		String mensagem = media >=6 ? "Aluno aprovado" : "Aluno reprovado";
		System.out.println(mensagem);
ler.close();
}
}
