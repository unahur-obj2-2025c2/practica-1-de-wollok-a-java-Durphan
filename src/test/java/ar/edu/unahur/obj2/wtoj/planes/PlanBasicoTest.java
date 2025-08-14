package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.*;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

class PlanBasicoTest {
    IPlan planA = new PlanBasico(6, 2.0);
    Usuario pepe = new Usuario(planA);

    @Test
    void testCostoPlanAUsuarioSinContenido() {
        assertEquals(2.0, planA.costoPlan(pepe));
    }

    @Test
    void testCostoPlanAUsuarioConContenidoSinExcedentes() {
        pepe.verContenido(new Pelicula("Video 1", 1.0));
        pepe.verContenido(new Pelicula("Video 2", 1.0));
        assertEquals(2.0, planA.costoPlan(pepe));
    }

    @Test
    void testCostoPlanAUsuarioConContenidoConExcedentes() {
        for (int i = 1; i <= 10; i++) {
            pepe.verContenido(new Pelicula("Video " + i, 1.0));
        }
        assertEquals(10, pepe.getListaContenido().size());
        assertEquals(6.0, planA.costoPlan(pepe));
    }
}
