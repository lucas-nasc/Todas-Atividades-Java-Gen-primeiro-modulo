package vetoresarrays;

import java.util.Scanner;

public class ArrayMatriz {
    public static void main(String[] args) {
        int[] [] numeros = new int [3][2];
        int linha, coluna, somaNumeros = 0,somaDiagonal =0;

        Scanner leia = new Scanner(System.in);

//Pensar como se fosse uma tabela  primeira linha sempre vai ser ZERO

        for(linha=0; linha<3; linha++){
            for (coluna=0;coluna<2;coluna++){
                System.out.println("Entre com um numero ");
                numeros[linha][coluna] = leia.nextInt();
                somaNumeros += numeros[linha][coluna];
                if (linha==coluna){
                    somaDiagonal+=numeros[linha][coluna];

                }

            }

        }
        System.out.println(somaDiagonal);

        System.out.println("Somatorio dos numeros: " + somaNumeros);
    }




}
