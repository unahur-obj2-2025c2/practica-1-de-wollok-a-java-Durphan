package ar.edu.unahur.obj2.wtoj.contenido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EpisodioTest {

    @Test
    void testCreacionEpisodio() {
        Episodio pilot = new Episodio(1, "Pilot", 60.0);
        assertEquals(1, pilot.getNumero());
        assertEquals("Pilot", pilot.getTitulo());
        assertEquals(60.0, pilot.getCosto());
    }
}
