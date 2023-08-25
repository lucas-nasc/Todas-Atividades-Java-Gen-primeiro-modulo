import java.util.Scanner;

public class ExercicioMatrizes01 {
    public static void main(String[] args) {

        int [] [] numero = new int [3] [3] ;
        int linha, coluna,somaP = 0,somaS = 0,n ;

        Scanner leia = new Scanner(System.in);

        for (linha = 0; linha <3;linha++){
            for (coluna = 0; coluna < 3; coluna ++){
                System.out.println("Entre com um numero: ");
                numero[linha][coluna] = leia.nextInt();

            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.print(numero[i][i] + " ");
            somaP += numero[i][i];

        }

        System.out.println("\n");

        for (int i = 0; i < numero.length ; i++) {
            for (int j = 0; j < numero.length; j++) {
                if (i+j == numero.length - 1){
                    System.out.println(numero[i][j] + " ");
                    somaS+= numero[i][i];
                }

            }
            
        }

        System.out.println("A Soma de todos os elementos da Diagonal Principal " + somaP);
        System.out.println("A Soma de todos os elementos da Diagonal Secundária " + somaS);





    }
}
