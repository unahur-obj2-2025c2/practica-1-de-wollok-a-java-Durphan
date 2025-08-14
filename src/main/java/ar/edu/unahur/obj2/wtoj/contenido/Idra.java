package ar.edu.unahur.obj2.wtoj.contenido;

public class Idra {
    private Double valor = 0.5;
    private static final Idra instance = new Idra();

    private Idra() {
        // Private constructor to prevent instantiation
    }

    public static Idra getInstance() {
        return instance;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
