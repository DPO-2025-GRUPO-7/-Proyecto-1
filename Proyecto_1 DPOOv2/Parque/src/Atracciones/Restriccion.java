package Atracciones;

public class Restriccion {
    private String descripcion;

    public Restriccion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Restriccion{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}
