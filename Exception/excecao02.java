import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao02 {

    // lançamento  de uma exceção quando ocorre uma divisão por zero
    public static int quociente(int numerador, int denominador)throws ArithmeticException{ //verifica se o erro é aritimetico throws ArithmeticException
        return  numerador/ denominador;
    }

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        boolean continueLoop = true;

        do {

            try {
                System.out.println("\nEntre com o numerador: ");
                int numerador = leia.nextInt();
                System.out.println("\nEntre com o denominador: ");
                int denominador = leia.nextInt();
                int resultado = quociente(numerador,denominador);

                System.out.printf("\nResultado %d / %D  = %d\n",numerador,denominador,resultado);
                continueLoop = false;
                //Fim do try
            }catch (InputMismatchException inputMismatchException){
                System.err.printf("\nExceção %s \n",inputMismatchException);
                leia.nextLine();
                System.out.println("\nVocê deve entrar com um valor do tipo inteiro. Por favor tente novamente \n");
            }catch (ArithmeticException arithmeticException){
                System.out.printf("\nExceção: " + arithmeticException);
                System.out.println("\nZero é um denominador inválido. Por favor tente novamente");
            }

        }while (continueLoop);
    }
}
