package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private String titulo;
    private Double costoBase;

    protected abstract Double doCosto();

    protected Contenido(String titulo, Double costoBase) {
        this.costoBase = costoBase;
        this.titulo = titulo;
    }

    public Double costo() {
        return this.costoBase * this.doCosto();
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }
}
