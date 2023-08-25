package classesAbstratas;

public abstract class Telefone {
    private String tipo;

    public Telefone(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    abstract public void disca(String numero);

    abstract public void toca(int numToques);

}

