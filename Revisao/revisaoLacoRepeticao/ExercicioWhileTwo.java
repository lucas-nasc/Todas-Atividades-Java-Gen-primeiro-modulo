package revisaoLacoRepeticao;

import java.util.Scanner;

public class ExercicioWhileTwo {
    public static void main(String[] args) {
        int idade,sexo,categoria;
        int backend =0,frontend=0,mobile=0,fullstack=0;
        String continuar ="S";

        Scanner leia = new Scanner(System.in);

        while (!continuar.equalsIgnoreCase("N")){
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();

            System.out.println("Digite seu sexo: \n"+" 1 – Masculino\n" +
                    "2 – Feminino\n" +
                    "3 – Outros\n");
            sexo = leia.nextInt();

            System.out.println("Digite sua categoria: \n"+" 1 – Backend\n" +
                    "2 – Frontend\n" +
                    "3 – Mobile\n" +
                    "4 – FullStack\n");
            categoria = leia.nextInt();

            if (categoria == 1){
                backend++;
            } else if (sexo ==2 && categoria==2) {
                frontend++;
            } else if (sexo == 1 && categoria ==3 && idade>40) {
                mobile++;
            } else if (sexo ==2 && categoria ==4 && idade <30) {
                fullstack++;
            }

            System.out.println("deseja continuar a leitura dos dados de um novo colaboradore ou não (S/N) ");
            continuar = leia.next();

        }
        System.out.println("O número de pessoas desenvolvedoras Backend é " + backend);
        System.out.println("O número de mulheres desenvolvedoras Frontend é " + frontend);
        System.out.println("O número de homens desenvolvedores Mobile maiores de 40 anos é " + mobile);
        System.out.println("O número de mulheres desenvolvedoras FullStack menores de 30 anos é " + fullstack);



    }
}
