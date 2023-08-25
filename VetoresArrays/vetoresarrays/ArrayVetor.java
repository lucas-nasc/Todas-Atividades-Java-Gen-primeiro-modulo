package vetoresarrays;

import java.util.Scanner;

public class ArrayVetor {
    public static void main(String[] args) {

        float n1,n2,n3,somaMedia=0,mg;
        int x;

        //Quando colocamos um colchete só indicamos que é um Arrayvetor, pos analizamos so linhas
        //Se colocarmos mais vira uma Matriz,pois analizamos linhas e colunas
        //Temos que instanciar o Arrayvetor
        float [] media = new float[4];

        Scanner leia = new Scanner(System.in);

       //o (x+1) é so para não comecar falando alune 0

        for (x =0 ;x <4;x++){
            System.out.println("\n Entre com a primeira nota do alune " + (x+1) +" : ");
            n1 = leia.nextFloat();
            System.out.println("\n Entre com a segunda nota do alune " +(x+1) + " : ");
            n2 = leia.nextFloat();
            System.out.println("\n Entre com a terceira  nota do alune " + (x+1) + " : ");
            n3 = leia.nextFloat();

            media[x] = (n1+n2+n3)/3;

            somaMedia += media[x];


        }
        mg = somaMedia/4;
        System.out.println("\n Media Geral: " + mg);

        for ( x = 0; x < 4 ; x++) {
            System.out.println("\n média alune " + (x+1) + "foi de: " + media[x]);
            System.out.printf("\n Media alune %d foi de : %f", x+1,media[x]);
        }

    }
}
