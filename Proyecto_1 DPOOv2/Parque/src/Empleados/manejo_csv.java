package Empleados;

import Atracciones.*;
import Tiquetes.*;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.nio.charset.StandardCharsets;


public class manejo_csv {
	
	ArrayList<Cargo> cargo_lista = new ArrayList<>();
	ArrayList<Personal> personal_lista = new ArrayList<>();
	ArrayList<Atraccion> atraccion_lista = new ArrayList<>();
	ArrayList<Turno> turnos_lista = new ArrayList<>();
	ArrayList<Turno> turnos_lista_agregar = new ArrayList<>();
	ArrayList<Tiquete> tiquetes_lista = new ArrayList<>();
	ArrayList<Tiquete> tiquetes_lista_agregar = new ArrayList<>();
	List<Atraccion> atraccion_lista = new ArrayList<>();
	List<Espectaculo> espectaculo_lista = new ArrayList<>();
	List<Empleado> empleado_lista = new ArrayList<>();
	public void leerFicheroPersonal(String nombreArchivo) {
		FileReader fr;
		try {
			fr = new FileReader(nombreArchivo);
			String linea = "";
			BufferedReader br = new BufferedReader(fr);
			String encabezado = br.readLine();

			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty())
					continue;

				String[] datoslinea = linea.split(";");
				if (datoslinea.length < 12) {

					continue;
				}
				int id_personal = Integer.valueOf(datoslinea[0].trim());
				String identificacion = (datoslinea[1].trim());
				String nombre = datoslinea[2].trim();
				String apellido = datoslinea[3].trim();
				int id_cargo = Integer.valueOf(datoslinea[4].trim());
				String usuario = datoslinea[5].trim();
				String password = datoslinea[6].trim();
				String telefono = datoslinea[7].trim();
				String correo = datoslinea[8].trim();
				int edad = Integer.valueOf(datoslinea[9].trim());
				String fecha_de_ingreso = datoslinea[10].trim();
				String activo = datoslinea[11].trim();

				Personal personal = new Personal(id_personal, identificacion, nombre, apellido, id_cargo, usuario,
						password, telefono, correo, edad, fecha_de_ingreso, activo);
				personal_lista.add(personal);
				//System.out.println(personal);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Personal loginPersonal(String usuario, String password) {
		for (Personal personal : personal_lista) {

			if (personal.getUsuario().equals(usuario) && personal.getPassword().equals(password)) {
				return personal;
			}
		}
		return null;
	}

	public void leerFicheroCargo(String nombreArchivo) {
		FileReader fr;
		try {
			fr = new FileReader(nombreArchivo);
			String linea = "";
			BufferedReader br = new BufferedReader(fr);
			String encabezado = br.readLine();
			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty())
					continue;

				String[] datoslinea = linea.split(";");
				if (datoslinea.length < 5) {

					continue;
				}

				int id_cargo = Integer.valueOf(datoslinea[0].trim());
				String Cargo = datoslinea[1].trim();
				String requerimiento = datoslinea[2].trim();
				int id_Atraccion = Integer.valueOf(datoslinea[3].trim());
				int experiencia_minima = Integer.valueOf(datoslinea[4].trim());

				Cargo cargo = new Cargo(id_cargo, Cargo, requerimiento, id_Atraccion, experiencia_minima);
				cargo_lista.add(cargo);
				System.out.println(cargo);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerFicheroTurno(String nombreArchivo) {
		turnos_lista.clear();

		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea = br.readLine();
			if (linea == null) {
				System.out.println("El archivo está vacío.");
				return;
			}

			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty())
					continue;

				String[] datoslinea = linea.split(";");
				if (datoslinea.length < 7) {
					continue;
				}

				try {
					int id_turno = Integer.parseInt(datoslinea[0].trim());
					String fecha = datoslinea[1].trim();
					String turno = datoslinea[2].trim();
					String tipo_accion = datoslinea[3].trim();
					int id_atrac_serv = Integer.parseInt(datoslinea[4].trim());
					int id_empleado = Integer.parseInt(datoslinea[5].trim());
					String rol = datoslinea[6].trim();

					if (fecha.isEmpty() || turno.isEmpty() || tipo_accion.isEmpty() || rol.isEmpty()) {
						System.out.println("Campos de texto vacíos en la línea, se omite: " + linea);
						continue;
					}

					Turno turn = new Turno(id_turno, fecha, turno, tipo_accion, id_atrac_serv, id_empleado, rol);
					turnos_lista.add(turn);
					System.out.println(turn);

				} catch (NumberFormatException e) {
					// System.out.println("Error de formato numérico en la línea, se omite: " +
					// linea);
				}
			}

		} catch (IOException e) {
			System.out.println("Error leyendo el archivo: " + e.getMessage());
		}
	}

	public void leerFicheroAtracciones(String nombreArchivo) {

		FileReader fr;
		try {
			fr = new FileReader(nombreArchivo, StandardCharsets.UTF_8);
			String linea = "";
			BufferedReader br = new BufferedReader(fr);
			String encabezado = br.readLine();
			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty())
					continue;

				String[] datoslinea = linea.split(";");
				if (datoslinea.length < 21) {

					continue;
				}
				int id_Atraccion = Integer.valueOf(datoslinea[0].trim());
				String nombre_Atraccion = datoslinea[1].trim();
				String tipo = datoslinea[2].trim();
				String descripcion = datoslinea[3].trim();
				String duracion = datoslinea[4].trim();
				String ubicación = datoslinea[5].trim();
				String Cupo_max = (datoslinea[6].trim());
				String numero_empleados = (datoslinea[7].trim());
				String tipo_Riesgo = datoslinea[8].trim();
				String edad_min = (datoslinea[9].trim());

				String edad_max = (datoslinea[10].trim());

				String altura_min = (datoslinea[11].trim());

				String altura_max = (datoslinea[12].trim());

				String peso_min = (datoslinea[13].trim());

				String peso_max = (datoslinea[14].trim());

				String contraindicaciones = datoslinea[15].trim();
				String recomendaciones = datoslinea[16].trim();
				String ambiente = datoslinea[17].trim();
				String tipo_tiquete = datoslinea[18].trim();
				String temporada = datoslinea[19].trim();
				String vigencia_mantenimiento = datoslinea[20].trim();

				Atraccion atraccion = new Atraccion(id_Atraccion, nombre_Atraccion, tipo, descripcion, duracion,
						ubicación, Cupo_max, numero_empleados, tipo_Riesgo, edad_min, edad_max, altura_min, altura_max,
						peso_min, peso_max, contraindicaciones, recomendaciones, ambiente, tipo_tiquete, temporada,
						vigencia_mantenimiento);

				atraccion_lista.add(atraccion);
				System.out.println(atraccion);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerFicheroTiquetes(String nombreArchivo) {
		tiquetes_lista.clear();

		try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
			String linea = br.readLine();
			if (linea == null) {
				System.out.println("El archivo está vacío.");
				return;
			}
			while ((linea = br.readLine()) != null) {
				if (linea.trim().isEmpty())
					continue;
				
				String[] datoslinea = linea.split(";");
				if (datoslinea.length < 10) {
					continue;
				}
				try {
					int id_tiquete = Integer.parseInt(datoslinea[0].trim());
					String tipo_tiquete = datoslinea[1].trim();
					String temporada = datoslinea[2].trim();
					String activo = datoslinea[5].trim();
					String fastpass = datoslinea[6].trim();
					String id_comprador = datoslinea[7].trim();
					int precio = Integer.parseInt(datoslinea[8].trim());
					String plan_temporal = datoslinea[9].trim();
					
					Tiquete t = new Tiquete(id_tiquete, tipo_tiquete, temporada, activo, fastpass, id_comprador, precio,
							plan_temporal);
					tiquetes_lista.add(t);
					System.out.println(t);

				} catch (NumberFormatException e) {
					// System.out.println("Error de formato numérico en la línea, se omite: " +
					// linea);
				}
			}

		} catch (IOException e) {
			System.out.println("Error leyendo el archivo: " + e.getMessage());
		}
	}

	public void escribirFicheroTurnos(String nombreArchivo) {

		if (turnos_lista_agregar.isEmpty()) {
			System.out.println("No hay turnos para agregar.");
			return;
		}
		File archivo = new File(nombreArchivo);
		boolean archivoExiste = archivo.exists();
		boolean agregarEncabezado = !archivoExiste || archivo.length() == 0;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {

			if (agregarEncabezado) {
				bw.write("id_turno;fecha;turno;tipo_accion;id_atrac_serv;id_empleado;rol");
				bw.newLine();
			}

			for (Turno tur : turnos_lista_agregar) {
				int id_turno = tur.getId_turno();
				String fecha = tur.getFecha();
				String turno = tur.getTurno();
				String tipo_accion = tur.getTipo_accion();
				int id_atrac_serv = tur.getId_atrac_serv();
				int id_empleado = tur.getId_empleado();
				String rol = tur.getRol();

				if (fecha.isEmpty() || turno.isEmpty() || tipo_accion.isEmpty() || rol.isEmpty()) {
					System.out.println("Turno con campos vacíos, se omite.");
					continue;
				}
				if (id_turno <= 0 || id_atrac_serv <= 0 || id_empleado <= 0) {
					System.out.println("Turno con IDs inválidos, se omite.");
					continue;
				}

				String lineaTexto = id_turno + ";" + fecha + ";" + turno + ";" + tipo_accion + ";" + id_atrac_serv + ";"
						+ id_empleado + ";" + rol;
				bw.write(lineaTexto);
				bw.newLine();
			}

			turnos_lista_agregar.clear();
			System.out.println("Turnos agregados correctamente al archivo: " + nombreArchivo);

		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}

	public void escribirFicheroTiquetes(String nombreArchivo) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
			for (Tiquete t : tiquetes_lista_agregar) {
				String linea = t.getId_tiquete() + ";" + t.getTipo_tiquete() + ";" + t.getTemporada() + ";"
						+ t.getFecha_uso_ini() + ";" + t.getFecha_uso_fin() + ";" + t.getActivo() + ";"
						+ t.getFastpass() + ";" + t.getId_comprador() + ";" + t.getPrecio() + ";"
						+ t.getPlan_temporal();

				bw.write(linea);
				bw.newLine();
			}
			bw.flush();
			tiquetes_lista_agregar.clear();
			System.out.println("Tiquetes agregados correctamente al archivo: " + nombreArchivo);

		} catch (IOException e) {
			System.out.println("Error escribiendo el archivo: " + e.getMessage());
		}
	}

	public static int obtenerSiguienteId(String rutaCSV) {
		int maxId = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(rutaCSV))) {
			String linea;
			br.readLine();

			while ((linea = br.readLine()) != null) {

				if (linea.trim().isEmpty())
					continue;

				String[] columnas = linea.split(";");
				if (columnas.length > 0 && !columnas[0].isEmpty()) {
					try {
						int idActual = Integer.parseInt(columnas[0]);
						if (idActual > maxId) {
							maxId = idActual;
						}
					} catch (NumberFormatException e) {

						System.out.println("ID inválido en la línea: " + linea);
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error leyendo el archivo: " + e.getMessage());
		}

		return maxId + 1;
	}

	public void agreagar_lista_turno(String fecha, String turno, String tipo_accion, int id_atrac_serv, int id_empleado,
			String rol) {
		int id_turno = obtenerSiguienteId("turnos.csv");
		turnos_lista_agregar.add(new Turno(id_turno, fecha, turno, tipo_accion, id_atrac_serv, id_empleado, rol));
	}

	public void agregarTiquete(String tipo_tiquete, String temporada, String activo, String fastpass, String id_comprador, int precio, String plan_temporal) {
		// FECHA IMPORTANTE QUE ESTE EN EL FORMATO yyyy-MM-dd
		int id_tiquete = obtenerSiguienteId("tiquetes.csv");
		Tiquete nuevo = new Tiquete(id_tiquete, tipo_tiquete, temporada, activo, fastpass, id_comprador, precio,
				plan_temporal);

		tiquetes_lista_agregar.add(nuevo);
	}
	public void validarTiquete(Tiquete tiq) {
		
	}

public void mostrarAtracciones() {
    for (Atraccion a : atraccion_lista) {
        System.out.println(a.getNombre_Atraccion());
    }
}

public void mostrarEspectaculos() {
    for (Espectaculo e : espectaculo_lista) {
        System.out.println(e.toString());
    }
}

public void mostrarEmpleados() {
    for (Empleado e : empleado_lista) {
        System.out.println(e.toString());
    }
}
public List<Empleado> empleado_lista = new ArrayList<>();

public void leerFicheroEmpleados(String nombreArchivo) {
    empleado_lista.clear();

    try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo, StandardCharsets.UTF_8))) {
        String encabezado = br.readLine(); // Omitir encabezado

        String linea;
        while ((linea = br.readLine()) != null) {
            if (linea.trim().isEmpty()) continue;

            String[] datos = linea.split(";");
            if (datos.length < 3) continue;

            try {
                int id = Integer.parseInt(datos[0].trim());
                String nombre = datos[1].trim();
                String rol = datos[2].trim();

                Empleado emp = new Empleado(id, nombre, rol);
                empleado_lista.add(emp);
                System.out.println("Empleado cargado: " + emp);

            } catch (NumberFormatException e) {
                System.out.println("Error de formato en la línea: " + linea);
            }
        }

    } catch (IOException e) {
        System.out.println("Error leyendo empleados: " + e.getMessage());
    }
}
public Atraccion buscarAtraccionPorId(int id) {
    for (Atraccion a : atraccion_lista) {
        if (a.getId_Atraccion() == id) {
            return a;
        }
    }
    return null;
}
public Empleado buscarEmpleadoPorId(int id) {
    for (Empleado e : empleado_lista) {
        if (e.getIdEmpleado() == id) {
            return e;
        }
    }
    return null;
}
public void asignarEmpleadosAAtraccion(int idAtraccion, List<Integer> idsEmpleados) {
    Atraccion atr = buscarAtraccionPorId(idAtraccion);
    if (atr == null) {
        System.out.println("Atracción no encontrada.");
        return;
    }

    List<Empleado> asignados = new ArrayList<>();
    for (int idEmp : idsEmpleados) {
        Empleado e = buscarEmpleadoPorId(idEmp);
        if (e != null) {
            asignados.add(e);
        } else {
            System.out.println("Empleado con ID " + idEmp + " no encontrado.");
        }
    }

    atr.asignarEmpleados(asignados);
    System.out.println("Empleados asignados a " + atr.getNombre_Atraccion());
}
		
}
