package revisaoArray;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int vetorNum[] = {2,5,1,3,4,9,7,8,10,6};
        int n1,indice;

        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o numero que deseja encontrar: ");
        n1 = leia.nextInt();

        for ( indice =0; indice < 10; indice++){
            if (vetorNum[indice] == n1){
                System.out.println("o numero " + n1 + " esta na posicao "  + indice);


            }
        }

        if (n1 >10){
            System.out.println("numero não encontrado " + n1);
        } else if (n1 < 1) {

            System.out.println("numero não encontrado " + n1);
        }
    }
}
