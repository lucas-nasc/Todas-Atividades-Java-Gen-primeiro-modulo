package classesAbstratas;

public class Celular extends Telefone {

    public Celular(){
        super("Telefone Celular");

    }

    @Override
    public void disca(String numero) {

        System.out.println("O numero:"+ numero + "é o celular");
    }

    @Override
    public void toca(int numToques) {
        switch (numToques){
            case 1:
                System.out.println("\nTrimmmm Trimmm");
                break;
            case 2:
                System.out.println("\n0h Neymar ... Oh neymar");
                break;
            default:
                System.out.println("\nAin zé da manga... ain Zé da manda");
        }

    }

}
