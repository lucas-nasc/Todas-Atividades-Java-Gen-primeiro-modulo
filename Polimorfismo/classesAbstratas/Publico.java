package classesAbstratas;

public class Publico extends Telefone{

    @Override
    public void disca(String numero) {
        if (numero.charAt(0)=='9' || numero.charAt(0)== '8'){//o CHARAT ele pega o primeiro caracter e verefica
            System.out.println("\nEste telefone não liga para celular...");
        }else {
            System.out.println("\nDiscando: " +numero );
        }

    }

    @Override
    public void toca(int numToques) {
        for (int i = 0; i < numToques; i++) {
            System.out.println("\nPrimprim... Primprim");
        }

    }

    public Publico() {
        super("telefone");
    }

}
