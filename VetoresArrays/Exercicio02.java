import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        int [] vetor = new int[10];
        int i,n,soma=0;
        float media=0,mg;

        Scanner leia = new Scanner(System.in);
        for ( i = 0; i <10 ; i++) {
            System.out.println("Digite o numero do vetor: " + i);
            n = leia.nextInt();

            vetor[i] = n;
        }

        System.out.println("Os vetores digitados são ");

        for ( i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n Os numeros pares são " );

        for (i = 0; i< 10; i++){
            if (vetor[i] %2 ==0){
                System.out.print(" "+vetor[i] );
            }
        }

        System.out.println("\n Os numeros impares são ");

        for (i =0; i<10; i++){
            if (vetor[i]%2 !=0){
                System.out.print(" "+vetor[i]);
            }
        }
        System.out.println("\n");

        for (i=0; i<10; i++){
            soma += vetor[i];
            media++;
        }

        mg = soma/media;
        System.out.println("A soma de todos os elementos é: " + soma);
        System.out.println("A media de todos os elementos é " + mg);
        }








}
