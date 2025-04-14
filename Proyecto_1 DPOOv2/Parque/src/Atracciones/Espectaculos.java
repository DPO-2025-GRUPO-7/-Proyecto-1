package Atracciones;

public class Espectaculos {
	int id_espectaculo	;
	String nombre_espectaculo; 
	String tipo; 	
	String descripcion;
	String duracion;	
	String turno;
	String ubicacion;
	String cupo_maximo;
	String empresa_contratista;
	String ambiente;
	private boolean enTemporada;
    private boolean enFuncionamiento;

	public Espectaculo(int id_espectaculo, String nombre_espectaculo, String tipo, String descripcion, String duracion,
                       String turno, String ubicacion, int cupo_maximo, String empresa_contratista, String ambiente,
                       boolean enTemporada) {
        this.id_espectaculo = id_espectaculo;
        this.nombre_espectaculo = nombre_espectaculo;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.turno = turno;
        this.ubicacion = ubicacion;
        this.cupo_maximo = cupo_maximo;
        this.empresa_contratista = empresa_contratista;
        this.ambiente = ambiente;
        this.enTemporada = enTemporada;
        this.enFuncionamiento = false;
    }
	
	
	
	public int getId_espectaculo() {
		return id_espectaculo;
	}



	public void setId_espectaculo(int id_espectaculo) {
		this.id_espectaculo = id_espectaculo;
	}



	public String getNombre_espectaculo() {
		return nombre_espectaculo;
	}



	public void setNombre_espectaculo(String nombre_espectaculo) {
		this.nombre_espectaculo = nombre_espectaculo;
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



	public String getTurno() {
		return turno;
	}



	public void setTurno(String turno) {
		this.turno = turno;
	}



	public String getUbicacion() {
		return ubicacion;
	}



	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public String getCupo_maximo() {
		return cupo_maximo;
	}



	public void setCupo_maximo(String cupo_maximo) {
		this.cupo_maximo = cupo_maximo;
	}



	public String getEmpresa_contratista() {
		return empresa_contratista;
	}



	public void setEmpresa_contratista(String empresa_contratista) {
		this.empresa_contratista = empresa_contratista;
	}



	public String getAmbiente() {
		return ambiente;
	}



	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}



	@Override
	public String toString() {
        return "Espectaculo{" +
                "id=" + id_espectaculo +
                ", nombre='" + nombre_espectaculo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", duracion='" + duracion + '\'' +
                ", turno='" + turno + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", cupo_maximo=" + cupo_maximo +
                ", empresa_contratista='" + empresa_contratista + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", enTemporada=" + enTemporada +
                ", enFuncionamiento=" + enFuncionamiento +
                '}';
    }
	public void activar() {
        if (enTemporada) {
            enFuncionamiento = true;
            System.out.println("Espectáculo activado.");
        } else {
            System.out.println("El espectáculo no está en temporada.");
        }
    }

    public void desactivar() {
        enFuncionamiento = false;
        System.out.println("Espectáculo desactivado.");
    }

    public boolean puedeRealizarse(String clima) {
        if (!enFuncionamiento) return false;
        if (ambiente.equalsIgnoreCase("exterior") && clima.equalsIgnoreCase("tormenta")) {
            return false;
        }
        return true;
    }

    public String resumen() {
        return nombre_espectaculo + " (" + tipo + ") - " + descripcion +
                ". Turno: " + turno + ". Ubicación: " + ubicacion;
    }
}