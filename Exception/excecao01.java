public class excecao01 {
    public static void main(String[] args) {

        String frase = null,novaFrase = null;

        try{
            novaFrase = frase.toUpperCase();
        }catch (NullPointerException e) { //Se for nulo acontece o bloco abaixo Captura da possivel exceção
           //tratamento da exceção
            System.out.println("\nA frase inicial está nula, para solucionar tal problema,"
            + " Foi lhe atribuido um valor default");

            frase = "Frase vazia";

            novaFrase = frase.toUpperCase();
        }
        System.out.println("\nAntiga Frase: " + frase);
        System.out.println("\nNova frase: " + novaFrase);



    }
}
