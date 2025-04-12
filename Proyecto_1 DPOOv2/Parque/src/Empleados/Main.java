package Empleados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Cargando Usuarios");
		manejo_csv cargar_datos = new manejo_csv();
		cargar_datos.leerFicheroPersonal("Personal.csv");
		cargar_datos.leerFicheroCargo("cargo.csv");
		cargar_datos.leerFicheroAtracciones("Atracciones.csv");
		
		// cargar_datos.leerFicheroLugaresServicios("LugaresServicios.csv");
		// Carga de datos
		//cargar_datos.agreagar_lista_turno("3-10-25",	"tarde",	"caja",	2,	3,	"cajero");
		//cargar_datos.escribirFicheroTurnos("turnos.csv");
		cargar_datos.agregarTiquete( "Diamante",  "si",  "si",  "si",  "1",  43000,  "diario");
		cargar_datos.escribirFicheroTiquetes("tiquetes.csv");
		cargar_datos.leerFicheroTiquetes("tiquetes.csv");
		
		cargar_datos.leerFicheroTurno("turnos.csv");
		
		System.out.println("Ingrese su usuario: ");
		Scanner sc = new Scanner(System.in);
		String usuario_ingresado = sc.nextLine();
		System.out.print("Ingrese su contraseña: ");
		String pass = sc.nextLine();
		
		// System.out.println(cargar_datos.loginPersonal(usuario_ingresado, pass));
		if (cargar_datos.loginPersonal(usuario_ingresado, pass) != null) {
			// Verificar si tiene el cargo administrador
			System.out.println(cargar_datos.loginPersonal(usuario_ingresado, pass));
			if (cargar_datos.loginPersonal(usuario_ingresado, pass).getId_cargo() == 7) {
				System.out.println(
						"Bienvenido administrador " + cargar_datos.loginPersonal(usuario_ingresado, pass).getUsuario());
				System.out.println("Que accion desea realizar: ");
				
			}
		} else {
			System.out.println("ID o contraseña incorrectos, intente de nuevo.");
		}

	}

}
