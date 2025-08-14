package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
    private Double valor = 0.5;
    public static final Idra instance = new Idra();

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private Idra() {

    }

    public static Idra getInstance() {
        return instance;
    }

}
