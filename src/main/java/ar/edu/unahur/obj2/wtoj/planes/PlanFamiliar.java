package ar.edu.unahur.obj2.wtoj.planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanFamiliar implements IPlan {
    private Integer limite;
    private Double costoBase;

    public PlanFamiliar(Integer limite, Double costoBase) {
        this.limite = limite;
        this.costoBase = costoBase * 0.15;
    }

    @Override
    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidos = usuario.getListaContenido();
        if (contenidos.size() <= limite) {
            return costoBase;
        } else {
            List<Contenido> excedentes = contenidos.subList(limite, contenidos.size());
            return costoBase + excedentes.stream().mapToDouble(Contenido::costo).sum();
        }
    }

}
