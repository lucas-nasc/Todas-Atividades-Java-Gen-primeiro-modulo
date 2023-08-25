package classesAbstratas;

public class Fixo  extends Telefone{

    public Fixo() {
        super("Telefone fixo");
    }

    @Override
    public void disca(String numero) {
        System.out.println("\nDicando: " + numero);

    }

    @Override
    public void toca(int numToques) {
        for (int i = 0; i <numToques ; i++) {
            System.out.println("\nAcererrê");
        }

    }
}
