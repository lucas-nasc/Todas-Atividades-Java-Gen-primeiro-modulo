import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int n1,x=0, n = 0;
        int[] numero = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner leia = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        n1 = leia.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numero[i] == n1) {
                System.out.printf("O numero  %d esta localizado na posição %d", numero[i], i);

            }else {
                x++;
            }

        }
        if (x ==10){
            System.out.printf("O numero %d não foi encontrado",x);
        }
    }
}
