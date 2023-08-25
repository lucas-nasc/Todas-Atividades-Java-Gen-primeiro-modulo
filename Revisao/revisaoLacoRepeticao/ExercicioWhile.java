package revisaoLacoRepeticao;

import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        int idade,menor=0,maior=0;

        Scanner leia = new Scanner(System.in);

        System.out.println("digite sua idade ");
        idade = leia.nextInt();

        while (idade >=0){
            if (idade <21 && idade>0 ){
                menor++;

            } else if (idade >50) {
                maior++;

            }
            System.out.println("Digite sua idade ");
            idade = leia.nextInt();


        }
        System.out.println("Total de pessoas menores de 21 anos é " + menor);
        System.out.println("Total de pessoas maiores de 50 anos é " + maior);
    }
}
