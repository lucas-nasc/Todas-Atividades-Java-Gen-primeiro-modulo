package revisaoArray;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int linha,coluna;
        int somaP=0,somaS=0;

        Scanner leia =new Scanner(System.in);

        for (linha =0;linha<3;linha++){
            for (coluna=0;coluna<3;coluna++){
                System.out.println("Digite o numero ");
                matriz[linha][coluna] = leia.nextInt();
            }

        }
        for (linha = 0;  linha<3 ; linha++) {
            for ( coluna = 0; coluna < 3; coluna++) {
                if(linha==coluna){
                    System.out.print(matriz[linha][coluna] + " ");
                    somaP += matriz[linha][coluna];
                }

            }
        }
        System.out.println("\n");

        for (linha = 0; linha < 3; linha++){
            for (coluna=0 ; coluna<3; coluna++){
                if (linha + coluna ==2){
                    System.out.print(matriz[linha][coluna] + " ");
                    somaS += matriz[linha][coluna];

                }
            }
        }

        System.out.println("\nDiagonal principal a soma é igual a " + somaP);
        System.out.println("Diagonal secundaria a soma é igual a " + somaS);


    }

}
