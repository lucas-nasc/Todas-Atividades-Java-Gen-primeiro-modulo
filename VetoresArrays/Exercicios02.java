import java.util.Scanner;

public class Exercicios02 {
    public static void main(String[] args) {

        float [][] nota = new float[10][4];
        float [] media = new float[10];


        Scanner leia = new Scanner(System.in);

        for ( int aluno = 0; aluno < 10; aluno++) {
            for (int bimestre = 0; bimestre < 4; bimestre++) {
                System.out.println("Digite sua nota: " + (aluno+1) + " no " + bimestre + " bimestre" );
                nota[aluno][bimestre] = leia.nextFloat();

            }
            
        }
        for (int aluno = 0; aluno <10 ; aluno++) {
            float somanotas=0;
            for (int bimestre =0;bimestre<4;bimestre++){
                somanotas+=nota[aluno] [bimestre];
            }
            media[aluno] = somanotas/4;
        }
        System.out.println("Média dos participantes");
        for (int aluno = 0; aluno<10; aluno++){
            System.out.println("Aluno " + (aluno + 1) + ": " + media[aluno]);
        }



    }
}
