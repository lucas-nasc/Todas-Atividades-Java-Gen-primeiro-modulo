package revisaoLacoRepeticao;

import java.util.Scanner;

public class ExercicioLacoFor {
    public static void main(String[] args) {
        int n1,n2;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro numero (numero Menor)");
        n1 = leia.nextInt();

        System.out.println("Digite o primeiro segundo (numero Maior)");
        n2 = leia.nextInt();

        if (n1 > n2){
            System.out.println("o intervalo é inválido");
            return;
        }
        for (int i = n1; i <= n2 ; i++) {
            if (i % 3 ==0 && i %5 ==0){
                System.out.println(i + " é multiplo de 3 e 5");

            }

        }


    }
}
