package ar.edu.unahur.obj2.wtoj.usuario;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.wtoj.contenido.Contenido;
import ar.edu.unahur.obj2.wtoj.planes.IPlan;

public class Usuario {

    private IPlan plan;

    protected List<Contenido> listaContenido = new ArrayList<>();

    public IPlan getPlan() {
        return plan;
    }

    public void setPlan(IPlan plan) {
        this.plan = plan;
    }

    public List<Contenido> getListaContenido() {
        return listaContenido;
    }

    public void verContenido(Contenido contenido) {
        listaContenido.add(contenido);
    }

    public Usuario(IPlan plan, List<Contenido> listaContenido) {
        this.plan = plan;
        this.listaContenido = listaContenido;
    }

    public Usuario(IPlan plan) {
        this.plan = plan;
    }

}
