package Empleados;

public class Cargo {
	private int id_cargo;
	private String cargo;
	private String requerimiento;
	private int id_Atraccion;
	private int experiencia_minima;

	public Cargo(int id_cargo, String cargo, String requerimiento, int id_Atraccion, int experiencia_minima) {

		this.id_cargo = id_cargo;
		this.cargo = cargo;
		this.requerimiento = requerimiento;
		this.id_Atraccion = id_Atraccion;
		this.experiencia_minima = experiencia_minima;
	}

	public int getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(int id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getRequerimiento() {
		return requerimiento;
	}

	public void setRequerimiento(String requerimiento) {
		this.requerimiento = requerimiento;
	}

	public int getId_Atraccion() {
		return id_Atraccion;
	}

	public void setId_Atraccion(int id_Atraccion) {
		this.id_Atraccion = id_Atraccion;
	}

	public int getExperiencia_minima() {
		return experiencia_minima;
	}

	public void setExperiencia_minima(int experiencia_minima) {
		this.experiencia_minima = experiencia_minima;
	}

	@Override
	public String toString() {
		return "Cargo [id_cargo=" + id_cargo + ", cargo=" + cargo + ", requerimiento=" + requerimiento
				+ ", id_Atraccion=" + id_Atraccion + ", experiencia_minima=" + experiencia_minima + "]";
	}

}
