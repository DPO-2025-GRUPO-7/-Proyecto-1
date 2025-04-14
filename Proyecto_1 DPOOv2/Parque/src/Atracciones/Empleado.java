package Atracciones;

public class Empleado {
    private int idEmpleado;
    private String nombre;
    private String rol;

    public Empleado(int idEmpleado, String nombre, String rol) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.rol = rol;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", rol='" + rol + '\'' +
                '}';
    }
}
