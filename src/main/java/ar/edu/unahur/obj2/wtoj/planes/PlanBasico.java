package ar.edu.unahur.obj2.wtoj.planes;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class PlanBasico implements IPlan {
    private Integer limite;
    private Double costoBase;

    public PlanBasico(Integer limite, Double costoBase) {
        this.costoBase = costoBase;
        this.limite = limite;
    }

    public Double costoPlan(Usuario usuario) {
        List<Contenido> contenidoUsuario = usuario.getListaContenido();
        List<Contenido> excedentes = contenidoUsuario.subList(limite, contenidoUsuario.size());
        if (limite >= contenidoUsuario.size()) {
            return costoBase;
        } else {
            return costoBase + excedentes.stream().mapToDouble(Contenido::costo).sum();
        }

    }

}
