package model;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int opcao_menu, n1, n2;
		Boolean loop_menu = true;
		Scanner leia = new Scanner(System.in);
		while (loop_menu != false) {
		System.out.println("MENU"
				+ "\n1.Soma"
				+ "\n2.Subtração"
				+ "\n3.Divisão"
				+ "\n4.Multiplicação"
				+ "\n5.Sair");
		opcao_menu = leia.nextInt();
		
		switch (opcao_menu) {
		case 1:
			System.out.println("---------------"
					+ "\nDigite o primeiro número:"
					+ "\n");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número:"
					+ "\n");
			n2 = leia.nextInt();
			System.out.println("O total da soma é: ");
			System.out.println(n1 + n2);
			System.out.println("---------------");
			
			break;
		case 2:
			System.out.println("---------------"
					+ "\nDigite o primeiro número:"
					+ "\n");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número:"
					+ "\n");
			n2 = leia.nextInt();
			System.out.println("O total da subtração é: ");
			System.out.println(n1 - n2);
			System.out.println("---------------");
			
			break;
		case 3:
			System.out.println("---------------"
					+ "\nDigite o primeiro número:"
					+ "\n");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número:"
					+ "\n");
			n2 = leia.nextInt();
			System.out.println("O total da divisão é: ");
			System.out.println(n1 / n2);
			System.out.println("---------------");
			
			break;
		case 4:
			System.out.println("---------------"
					+ "\nDigite o primeiro número:"
					+ "\n");
			n1 = leia.nextInt();
			System.out.println("\nDigite o segundo número:"
					+ "\n");
			n2 = leia.nextInt();
			System.out.println("O total da multiplicação é: ");
			System.out.println(n1 * n2);
			System.out.println("---------------");
			
			break;
		case 5:
			System.out.println("Saindo...");
			loop_menu = false;
			break;
			default:
				System.out.println("Operação invalida!");
		}
		}
	}
}