package JavaTech;

import java.util.Scanner;

public class LacoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resposta;
		int _variavelA=9;
		
		Scanner ler = new Scanner(System.in);
		System.out.println(_variavelA);
		
		System.out.println("\n\t\tMenu de elogios");
		System.out.println("\n1- Pessoal incrivel");
		System.out.println("\n2- Pessoal é empolgado");
		System.out.println("\n3- Pessoal é gentil");
		System.out.println("\n4- Familia top de linha");
		System.out.println("\n Digite sua opção: ");
		resposta = ler.nextInt();
		
		switch(resposta) {
		case 1:
			System.out.println(" Pessoal incrivel");
		break;
		case 2:
			System.out.println("Pessoal é empolgado");
		break;
		case 3:
			System.out.println("Pessoal é gentil");
		break;
		case 4:
			System.out.println("Familia top de linha");
		break;
		default:// quando nenhuma das funções forem escolhidas o default manda uma mensagem educada
			System.out.println("\n opção invalida");
		
		}

	}

}
