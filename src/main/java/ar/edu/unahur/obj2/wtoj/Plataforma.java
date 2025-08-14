package ar.edu.unahur.obj2.wtoj;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.usuario.Usuario;

public class Plataforma {

    List<Usuario> listaUsuarios;

    public static Double costoMensual(Usuario usuario) {
        return usuario.getPlan().costoPlan(usuario);
    }

    public void agregarUsuario(Usuario usuario) {
        if (!listaUsuarios.contains(usuario)) {
            listaUsuarios.add(usuario);
        }
    }

    private void limpiarContenidos() {
        for (Usuario usuario : listaUsuarios) {
            usuario.vaciarContenido();
        }
    }

    private Double facturacionTotal() {
        return listaUsuarios.stream().mapToDouble(Plataforma::costoMensual).sum();
    }

    public Double cerrarMes() {
        Double facturacion = facturacionTotal();
        limpiarContenidos();
        return facturacion;
    }

}
