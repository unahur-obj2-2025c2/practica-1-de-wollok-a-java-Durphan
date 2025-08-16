package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {
    private List<Temporada> listaTemporadas = new ArrayList<>();

    public Serie(String titulo, Double costoBase, List<Temporada> listaTemporadas) {
        super(titulo, costoBase);
        this.listaTemporadas = listaTemporadas;
    }

    public Serie(String titulo, Double costoBase) {
        super(titulo, costoBase);
    }

    public void agregarTemporada(Temporada nuevaTemporada) {
        listaTemporadas.add(nuevaTemporada);
    }

    @Override
    protected Double doCosto() {
        return listaTemporadas.stream().mapToDouble(Temporada::doCosto).average().orElse(0.0)
                / listaTemporadas.stream().count();
    }
}
