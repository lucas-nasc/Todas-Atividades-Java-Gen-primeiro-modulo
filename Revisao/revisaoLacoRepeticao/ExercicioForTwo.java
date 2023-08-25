package revisaoLacoRepeticao;

import java.util.Scanner;

public class ExercicioForTwo {
    public static void main(String[] args) {
        int n1,par = 0,impar =0;

        Scanner leia = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i +"° numero desejado ");
            n1 = leia.nextInt();

            if (n1 % 2 == 0){
                par++;
            }else {
                impar++;

            }

        }
        System.out.println("Total de números pares: " + par);
        System.out.println("Total de números impares " + impar);


    }
}
