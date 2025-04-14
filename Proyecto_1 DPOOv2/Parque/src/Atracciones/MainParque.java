package Atracciones;

import java.util.Scanner;

public class MainParque {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManejoCSV manejador = new ManejoCSV(); // Tu clase de carga CSV
        int opcion;

        do {
            System.out.println("\n=== PARQUE DE ATRACCIONES ===");
            System.out.println("1. Cargar atracciones");
            System.out.println("2. Cargar espectáculos");
            System.out.println("3. Cargar empleados");
            System.out.println("4. Ver atracciones cargadas");
            System.out.println("5. Ver espectáculos cargados");
            System.out.println("6. Ver empleados cargados");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del archivo de atracciones (.csv): ");
                    String archivoAtracciones = sc.nextLine();
                    manejador.leerFicheroAtracciones(archivoAtracciones);
                    break;

                case 2:
                    System.out.print("Nombre del archivo de espectáculos (.csv): ");
                    String archivoEspectaculos = sc.nextLine();
                    manejador.leerFicheroEspectaculos(archivoEspectaculos);
                    break;

                case 3:
                    System.out.print("Nombre del archivo de empleados (.csv): ");
                    String archivoEmpleados = sc.nextLine();
                    manejador.leerFicheroEmpleados(archivoEmpleados);
                    break;

                case 4:
                    manejador.mostrarAtracciones();
                    break;

                case 5:
                    manejador.mostrarEspectaculos();
                    break;

                case 6:
                    manejador.mostrarEmpleados();
                    break;
                case 7:
                    System.out.print("ID de la atracción: ");
                    int idAtr = Integer.parseInt(sc.nextLine());

                System.out.print("IDs de empleados separados por coma (ej: 1,2): ");
                String[] idsTexto = sc.nextLine().split(",");
                List<Integer> idsEmpleados = new ArrayList<>();
                for (String idStr : idsTexto) {
                    idsEmpleados.add(Integer.parseInt(idStr.trim()));
                }

                manejador.asignarEmpleadosAAtraccion(idAtr, idsEmpleados);
                break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }

}
