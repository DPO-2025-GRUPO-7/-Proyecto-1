package Atracciones;

public class Advertencia {
    private String mensaje;

    public Advertencia(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Advertencia{" +
                "mensaje='" + mensaje + '\'' +
                '}';
    }
}
