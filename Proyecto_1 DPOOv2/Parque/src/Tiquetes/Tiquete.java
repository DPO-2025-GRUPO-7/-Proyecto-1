package Tiquetes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tiquete {
    private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private int id_tiquete;
    private String tipo_tiquete;     
    private String temporada;
    private String fecha_uso_ini;
    private String fecha_uso_fin;
    private String activo;
    private String fastpass;
    private String id_comprador;
    private int precio;
    private String plan_temporal;    

	    public Tiquete(int id_tiquete, String tipo_tiquete, String temporada, String activo,
	                   String fastpass, String id_comprador, int precio, String plan_temporal) {
	        this.id_tiquete = id_tiquete;
	        this.tipo_tiquete = tipo_tiquete.toLowerCase();
	        this.temporada = temporada;
	        this.activo = activo;
	        this.fastpass = fastpass;
	        this.id_comprador = id_comprador;
	        this.precio = precio;
	        this.plan_temporal = plan_temporal.toLowerCase();
	
	        LocalDate fechaInicio = LocalDate.now();
	        LocalDate fechaFin = calcularFechaFin(fechaInicio, this.plan_temporal);
	        this.fecha_uso_ini = fechaInicio.format(FORMATO_FECHA);
	        this.fecha_uso_fin = fechaFin.format(FORMATO_FECHA);
	       
	        if (fastpass.equalsIgnoreCase("sí") || fastpass.equalsIgnoreCase("true")) {
	            LocalDate fechaIni = LocalDate.parse(fecha_uso_ini, FORMATO_FECHA);
	            fecha_uso_fin = fechaIni.plusDays(1).format(FORMATO_FECHA);
	        }
	    }

    private LocalDate calcularFechaFin(LocalDate inicio, String plan) {
        switch (plan) {
            case "diario": return inicio.plusDays(1);
            case "semanal": return inicio.plusWeeks(1);
            case "mensual": return inicio.plusMonths(1);
            case "anual": return inicio.plusYears(1);
            default: throw new IllegalArgumentException("Plan temporal inválido: " + plan);
        }
    }

    public static DateTimeFormatter getFormatoFecha() {
		return FORMATO_FECHA;
	}

	public void setId_tiquete(int id_tiquete) {
		this.id_tiquete = id_tiquete;
	}

	public void setTipo_tiquete(String tipo_tiquete) {
		this.tipo_tiquete = tipo_tiquete;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public void setFecha_uso_ini(String fecha_uso_ini) {
		this.fecha_uso_ini = fecha_uso_ini;
	}

	public void setFecha_uso_fin(String fecha_uso_fin) {
		this.fecha_uso_fin = fecha_uso_fin;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public void setFastpass(String fastpass) {
		this.fastpass = fastpass;
	}

	public void setId_comprador(String id_comprador) {
		this.id_comprador = id_comprador;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setPlan_temporal(String plan_temporal) {
		this.plan_temporal = plan_temporal;
	}

	public int getId_tiquete() { return id_tiquete; }
    public String getTipo_tiquete() { return tipo_tiquete; }
    public String getTemporada() { return temporada; }
    public String getFecha_uso_ini() { return fecha_uso_ini; }
    public String getFecha_uso_fin() { return fecha_uso_fin; }
    public String getActivo() { return activo; }
    public String getFastpass() { return fastpass; }
    public String getId_comprador() { return id_comprador; }
    public int getPrecio() { return precio; }
    public String getPlan_temporal() { return plan_temporal; }

    @Override
    public String toString() {
        return id_tiquete + ";" + tipo_tiquete + ";" + temporada + ";" + fecha_uso_ini + ";" +
               fecha_uso_fin + ";" + activo + ";" + fastpass + ";" + id_comprador + ";" +
               precio + ";" + plan_temporal;
    }
}
