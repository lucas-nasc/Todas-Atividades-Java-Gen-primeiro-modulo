package revisaoLacoRepeticao;

import java.util.Scanner;

public class ExercicioDoWhileTwo {
    public static void main(String[] args) {
        int n1,soma=0;
        float res,media=0;

        Scanner leia = new Scanner(System.in);
        do {
            System.out.println("Digite um numero");
            n1 = leia.nextInt();

            if (n1 % 3 ==0 && n1 > 0){
                soma += n1;
                media++;
            }

        }while (n1 !=0);

        res = soma/media;

        System.out.println("A média de todos os números múltiplos de 3 é : " + res);

    }
}
