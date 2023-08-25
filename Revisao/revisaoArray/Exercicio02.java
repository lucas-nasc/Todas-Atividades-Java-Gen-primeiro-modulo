package revisaoArray;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        int vetorNum[] = new int[10];
        int  indice;
        float media,soma =0;

        Scanner leia = new Scanner(System.in);

        for (indice = 0; indice <10 ; indice++){
            System.out.println("Digite seu numero");
            vetorNum[indice] = leia.nextInt();

        }



        for (indice=0; indice<10 ; indice++){
            System.out.print(vetorNum[indice] + " ");
            soma += vetorNum[indice];

        }

        System.out.println("\n Pares");

        for (indice=0; indice<10; indice++){
            if (vetorNum[indice]%2 ==0){
                System.out.print(vetorNum[indice] + " ");
            }
        }

        System.out.println("\n Impares");

        for (indice = 0; indice<10; indice++){
             if (vetorNum[indice]%2 !=0) {
                System.out.print(vetorNum[indice] + " ");

            }
        }

        System.out.println("\n");
        media = soma/10;

        System.out.println("soma é igual a " + soma);
        System.out.println("a media é igual a " + media);

    }
}
