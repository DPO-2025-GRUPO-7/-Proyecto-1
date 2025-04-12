package Empleados;

import java.io.File;

public class verificar_ruta {
    public static void main(String[] args) {
        File archivo = new File("LugaresServicios.csv");
        if (archivo.exists()) {
            System.out.println("El archivo se encontró en: " + archivo.getAbsolutePath());
        } else {
            System.out.println(" El archivo NO se encontró. Ruta esperada: " + archivo.getAbsolutePath());
        }
    }
}