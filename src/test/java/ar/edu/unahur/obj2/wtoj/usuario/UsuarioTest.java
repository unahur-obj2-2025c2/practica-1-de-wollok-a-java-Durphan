package ar.edu.unahur.obj2.wtoj.usuario;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.contenido.Pelicula;
import ar.edu.unahur.obj2.wtoj.planes.IPlan;
import ar.edu.unahur.obj2.wtoj.planes.PlanBasico;
import ar.edu.unahur.obj2.wtoj.planes.PlanFamiliar;

class UsuarioTest {
    IPlan plan = new PlanBasico(10, 5.0);
    Usuario usuario = new Usuario(plan);

    @Test
    void puedeCambiarElPlan() {
        for (int i = 0; i < 10; i++) {
            usuario.verContenido(new Pelicula("Pelicula " + i, 10.0 + i));
        }
        assertEquals(5.0, usuario.getPlan().costoPlan(usuario));
        IPlan nuevoPlan = new PlanFamiliar(10, 5.0);
        usuario.setPlan(nuevoPlan);
        assertEquals(nuevoPlan, usuario.getPlan());
        assertEquals(0.75, usuario.getPlan().costoPlan(usuario));
    }
}
