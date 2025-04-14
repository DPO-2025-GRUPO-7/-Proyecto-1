package Atracciones;

public class Atraccion {
	private int id_Atraccion;
	private String nombre_Atraccion;
	private String tipo;
	private String descripcion;
	private String duracion;
	private String ubicación;
	private String Cupo_max;
	private String numero_empleados;
	private String tipo_Riesgo;
	private String edad_min;
	private String edad_max;
	private String altura_min;
	private String altura_max;
	private String peso_min;
	private String peso_max;
	private String contraindicaciones;
	private String recomendaciones;
	private String ambiente;
	private String tipo_tiquete;
	private String temporada;
	private String vigencia_mantenimiento;
	private boolean enMantenimiento = false;
    private boolean enOperacion = false;
    private NivelExclusividad nivelExclusividad;

    private List<Empleado> empleadosAsignados;
    private List<Restriccion> restricciones;
    private List<Advertencia> advertencias;
	    public Atraccion(int id_Atraccion, String nombre_Atraccion, String tipo, String descripcion, String duracion,
                     String ubicación, int cupo_max, int empleados_minimos, String tipo_Riesgo, int edad_min, int edad_max,
                     float altura_min, float altura_max, float peso_min, float peso_max,
                     String ambiente, String tipo_tiquete, String temporada, String vigencia_mantenimiento,
                     NivelExclusividad nivelExclusividad) {

        this.id_Atraccion = id_Atraccion;
        this.nombre_Atraccion = nombre_Atraccion;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.ubicación = ubicación;
        this.cupo_max = cupo_max;
        this.empleados_minimos = empleados_minimos;
        this.tipo_Riesgo = tipo_Riesgo;
        this.edad_min = edad_min;
        this.edad_max = edad_max;
        this.altura_min = altura_min;
        this.altura_max = altura_max;
        this.peso_min = peso_min;
        this.peso_max = peso_max;
        this.ambiente = ambiente;
        this.tipo_tiquete = tipo_tiquete;
        this.temporada = temporada;
        this.vigencia_mantenimiento = vigencia_mantenimiento;
        this.nivelExclusividad = nivelExclusividad;
        this.empleadosAsignados = new ArrayList<>();
        this.restricciones = new ArrayList<>();
        this.advertencias = new ArrayList<>();
    }


	public int getId_Atraccion() {
		return id_Atraccion;
	}


	public void setId_Atraccion(int id_Atraccion) {
		this.id_Atraccion = id_Atraccion;
	}


	public String getNombre_Atraccion() {
		return nombre_Atraccion;
	}


	public void setNombre_Atraccion(String nombre_Atraccion) {
		this.nombre_Atraccion = nombre_Atraccion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDuracion() {
		return duracion;
	}


	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}


	public String getUbicación() {
		return ubicación;
	}


	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}


	public String getCupo_max() {
		return Cupo_max;
	}


	public void setCupo_max(String cupo_max) {
		Cupo_max = cupo_max;
	}


	public String getNumero_empleados() {
		return numero_empleados;
	}


	public void setNumero_empleados(String numero_empleados) {
		this.numero_empleados = numero_empleados;
	}


	public String getTipo_Riesgo() {
		return tipo_Riesgo;
	}


	public void setTipo_Riesgo(String tipo_Riesgo) {
		this.tipo_Riesgo = tipo_Riesgo;
	}


	public String getEdad_min() {
		return edad_min;
	}


	public void setEdad_min(String edad_min) {
		this.edad_min = edad_min;
	}


	public String getEdad_max() {
		return edad_max;
	}


	public void setEdad_max(String edad_max) {
		this.edad_max = edad_max;
	}


	public String getAltura_min() {
		return altura_min;
	}


	public void setAltura_min(String altura_min) {
		this.altura_min = altura_min;
	}


	public String getAltura_max() {
		return altura_max;
	}


	public void setAltura_max(String altura_max) {
		this.altura_max = altura_max;
	}


	public String getPeso_min() {
		return peso_min;
	}


	public void setPeso_min(String peso_min) {
		this.peso_min = peso_min;
	}


	public String getPeso_max() {
		return peso_max;
	}


	public void setPeso_max(String peso_max) {
		this.peso_max = peso_max;
	}


	public String getContraindicaciones() {
		return contraindicaciones;
	}


	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}


	public String getRecomendaciones() {
		return recomendaciones;
	}


	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}


	public String getAmbiente() {
		return ambiente;
	}


	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}


	public String getTipo_tiquete() {
		return tipo_tiquete;
	}


	public void setTipo_tiquete(String tipo_tiquete) {
		this.tipo_tiquete = tipo_tiquete;
	}


	public String getTemporada() {
		return temporada;
	}


	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}


	public String getVigencia_mantenimiento() {
		return vigencia_mantenimiento;
	}


	public void setVigencia_mantenimiento(String vigencia_mantenimiento) {
		this.vigencia_mantenimiento = vigencia_mantenimiento;
	}

	public void iniciarOperacion() {
        if (!enMantenimiento && empleadosAsignados.size() >= empleados_minimos) {
            enOperacion = true;
            System.out.println("La atracción ha sido iniciada.");
        } else {
            System.out.println("No se puede iniciar. Verifique mantenimiento o número de empleados.");
        }
    }

    public void detenerOperacion() {
        enOperacion = false;
        System.out.println("La atracción ha sido detenida.");
    }

    public void asignarEmpleados(List<Empleado> empleados) {
        this.empleadosAsignados = empleados;
    }

    public void agregarRestriccion(Restriccion r) {
        restricciones.add(r);
    }

    public void agregarAdvertencia(Advertencia a) {
        advertencias.add(a);
    }

    public void mostrarRestricciones() {
        System.out.println("Restricciones:");
        for (Restriccion r : restricciones) {
            System.out.println(" - " + r.getDescripcion());
        }
    }

    public void mostrarAdvertencias() {
        System.out.println("Advertencias:");
        for (Advertencia a : advertencias) {
            System.out.println(" - " + a.getMensaje());
        }
    }
	@Override
	public String toString() {
		return "Atraccion [id_Atraccion=" + id_Atraccion + ", nombre_Atraccion=" + nombre_Atraccion + ", tipo=" + tipo
				+ ", descripcion=" + descripcion + ", duracion=" + duracion + ", ubicación=" + ubicación + ", Cupo_max="
				+ Cupo_max + ", numero_empleados=" + numero_empleados + ", tipo_Riesgo=" + tipo_Riesgo + ", edad_min="
				+ edad_min + ", edad_max=" + edad_max + ", altura_min=" + altura_min + ", altura_max=" + altura_max
				+ ", peso_min=" + peso_min + ", peso_max=" + peso_max + ", contraindicaciones=" + contraindicaciones
				+ ", recomendaciones=" + recomendaciones + ", ambiente=" + ambiente + ", tipo_tiquete=" + tipo_tiquete
				+ ", temporada=" + temporada + ", vigencia_mantenimiento=" + vigencia_mantenimiento + "]";
	}
	
	
	
	
	
	
	
	
}
