package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TemporadaTest {
    Temporada temporada = new Temporada(1);

    @Test
    void testAgregarEpisodio() {
        temporada.agregarEpisodio(new Episodio(1, "Pilot", 12.2));
        assertEquals(1, temporada.getListaEpisodios().size());
    }

    @Test
    void testCostoRetornaPromedio() {
        temporada.agregarEpisodio(new Episodio(1, "Pilot", 12.2));
        temporada.agregarEpisodio(new Episodio(2, "Episode 2", 15.0));
        assertEquals(2, temporada.getListaEpisodios().size());
        assertEquals(13.6, temporada.doCosto(), 0.1);
    }

    @Test
    void testGetListaEpisodios() {
        temporada.agregarEpisodio(new Episodio(1, "Pilot", 12.2));
        temporada.agregarEpisodio(new Episodio(2, "Episode 2", 15.0));
        assertEquals(2, temporada.getListaEpisodios().size());
    }

    @Test
    void testGetNumero() {
        assertEquals(1, temporada.getNumero());
    }

}
