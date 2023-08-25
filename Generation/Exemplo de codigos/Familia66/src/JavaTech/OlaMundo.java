package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 29;
		double altura = 1.95,nota1,nota2,nota3,media;
		String nome = "Lucas Nascimento Silva";
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\n olá Mundo!"); //\n broken line.
		System.out.println("\n nome: " + nome + " idade: " + idade + " altura: " + altura);
		
		System.out.println("Entre com a nota01 ");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a nota02");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a nota03");
		nota3 = leia.nextDouble();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("Suas notas foram: \n" +nota1 +" " +nota2 + " "+ nota3);
		
		System.out.println("A media é:" + media);
		
		System.out.printf("\n Média aritimetica foi de: %.2f ", media);// on printf use concatenate with coma(virgula) and print sameline
		                                              //use %.f with word spacial.
		if(media >= 7 && media<= 9) {
			System.out.println("Você esta aprovade");
		}else if(media == 10) {
			System.out.println("você tirou 10.. PARABENS VOCE ESTA APROVADE");
		}else if(media >=5 && media <7) {
			System.out.println("Alune de recuperação");
			
		}else {
			System.out.println("você esta REPROVADO");
		

	}
  }

}
