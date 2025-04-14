package Atracciones;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear empleados
        Empleado empleado1 = new Empleado(1, "Carlos Gómez", "Operador");
        Empleado empleado2 = new Empleado(2, "Laura Díaz", "Asistente");

        List<Empleado> empleadosAsignados = new ArrayList<>();
        empleadosAsignados.add(empleado1);
        empleadosAsignados.add(empleado2);

        // Crear restricciones y advertencias
        Restriccion r1 = new Restriccion("Altura mínima de 1.20m");
        Restriccion r2 = new Restriccion("No apto para personas con problemas cardíacos");
        Advertencia a1 = new Advertencia("Evite comer antes de ingresar");
        Advertencia a2 = new Advertencia("Use ropa cómoda");

        // Crear la atracción
        Atraccion montañaRusa = new Atraccion(
                101,
                "Montaña Rusa Extrema",
                "Mecánica",
                "Una montaña rusa con giros y caídas extremas",
                "3 minutos",
                "Zona A",
                20,
                2,
                "ALTO",
                12,
                65,
                1.2f,
                2.0f,
                40.0f,
                120.0f,
                "Exterior",
                "Diamante",
                "Verano",
                "2025-12-31",
                NivelExclusividad.DIAMANTE
        );

        // Asignar empleados, restricciones y advertencias
        montañaRusa.asignarEmpleados(empleadosAsignados);
        montañaRusa.agregarRestriccion(r1);
        montañaRusa.agregarRestriccion(r2);
        montañaRusa.agregarAdvertencia(a1);
        montañaRusa.agregarAdvertencia(a2);

        // Mostrar información
        System.out.println("Información de la atracción:");
        System.out.println(montañaRusa);

        // Mostrar advertencias y restricciones
        montañaRusa.mostrarRestricciones();
        montañaRusa.mostrarAdvertencias();

        // Probar iniciar operación
        montañaRusa.iniciarOperacion();

        // Probar detener operación
        montañaRusa.detenerOperacion();
    }
}
