package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.Pelicula;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

class PlanFamiliarTest {
    IPlan planFamiliar = new PlanFamiliar(10, 5.0);
    Usuario juan = new Usuario(planFamiliar);

    @Test
    void testCostoPlanAUsuarioSinContenido() {
        assertEquals(0.75, planFamiliar.costoPlan(juan));
    }

    @Test
    void testCostoPlanAUsuarioConContenidoSinExcedentes() {
        for (int i = 1; i <= 10; i++) {
            juan.verContenido(new Pelicula("Video " + i, 1.0));
        }
        assertEquals(0.75, planFamiliar.costoPlan(juan));
    }

    @Test
    void testCostoPlanAUsuarioConContenidoConExcedentes() {
        for (int i = 1; i <= 15; i++) {
            juan.verContenido(new Pelicula("Video " + i, 1.0));
        }
        assertEquals(5.75, planFamiliar.costoPlan(juan));
    }

    @Test
    void planFamiliarDeberiaTenerDiferenteCostoBaseQuePlanBasico() {
        IPlan planBasico = new PlanBasico(10, 5.0);
        assertNotEquals(planBasico.costoPlan(juan), planFamiliar.costoPlan(juan));
    }
}
