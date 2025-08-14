package ar.edu.unahur.obj2.wtoj.planes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

class PlanPremiumTest {
    @Test
    void testCostoPlan() {
        IPlan planA = new PlanPremium(2.2);
        Usuario pepe = new Usuario(planA);
        assertEquals(2.2, planA.costoPlan(pepe));
    }
}
