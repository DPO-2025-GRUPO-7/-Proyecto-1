package Empleados;

public class Turno {
	private int id_turno;
	private String fecha;
	private String turno;
	private String tipo_accion;
	private int id_atrac_serv;
	private int id_empleado;
	private String rol;

	public Turno(int id_turno, String fecha, String turno, String tipo_accion, int id_atrac_serv, int id_empleado,
			String rol) {
		this.id_turno = id_turno;
		this.fecha = fecha;
		this.turno = turno;
		this.tipo_accion = tipo_accion;
		this.id_atrac_serv = id_atrac_serv;
		this.id_empleado = id_empleado;
		this.rol = rol;
	}

	public int getId_turno() {
		return id_turno;
	}

	public void setId_turno(int id_turno) {
		this.id_turno = id_turno;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTipo_accion() {
		return tipo_accion;
	}

	public void setTipo_accion(String tipo_accion) {
		this.tipo_accion = tipo_accion;
	}

	public int getId_atrac_serv() {
		return id_atrac_serv;
	}

	public void setId_atrac_serv(int id_atrac_serv) {
		this.id_atrac_serv = id_atrac_serv;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "turnos [id_turno=" + id_turno + ", fecha=" + fecha + ", turno=" + turno + ", tipo_accion=" + tipo_accion
				+ ", id_atrac_serv=" + id_atrac_serv + ", id_empleado=" + id_empleado + ", rol=" + rol + "]";
	}

}
