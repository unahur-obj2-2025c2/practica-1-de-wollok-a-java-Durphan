package ar.edu.unahur.obj2.wtoj.contenido;

import java.util.*;

public class Temporada {

    private final Integer numero;
    private List<Episodio> listaEpisodios = new ArrayList<>();

    public Temporada(Integer numero) {
        this.numero = numero;
    }

    public Temporada(Integer numero, List<Episodio> listaEpisodios) {
        this.numero = numero;
        this.listaEpisodios = listaEpisodios;
    }

    public Integer getNumero() {
        return numero;
    }

    public List<Episodio> getListaEpisodios() {
        return listaEpisodios;
    }

    public void agregarEpisodio(Episodio nuevoEpisodio) {
        listaEpisodios.add(nuevoEpisodio);
    }

    protected Double costo() {
        return listaEpisodios.stream().mapToDouble(Episodio::getCosto).average().orElse(0.0)
                / listaEpisodios.stream().count();
    }

}
