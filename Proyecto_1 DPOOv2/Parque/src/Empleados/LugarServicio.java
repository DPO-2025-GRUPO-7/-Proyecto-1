package Empleados;
import java.util.ArrayList;

public class LugarServicio {
    private String tipo_lugar;
    private int id_lugar;
    private ArrayList<Integer> empleados_asignados;

    public LugarServicio(String tipo_lugar, int id_lugar, ArrayList<Integer> empleados_asignados) {
        this.tipo_lugar = tipo_lugar;
        this.id_lugar = id_lugar;
        this.empleados_asignados = empleados_asignados;
    }
    
    
    

    public String getTipo_lugar() {
		return tipo_lugar;
	}




	public void setTipo_lugar(String tipo_lugar) {
		this.tipo_lugar = tipo_lugar;
	}




	public int getId_lugar() {
		return id_lugar;
	}




	public void setId_lugar(int id_lugar) {
		this.id_lugar = id_lugar;
	}




	public ArrayList<Integer> getEmpleados_asignados() {
		return empleados_asignados;
	}




	public void setEmpleados_asignados(ArrayList<Integer> empleados_asignados) {
		this.empleados_asignados = empleados_asignados;
	}




	@Override
    public String toString() {
        return "LugarServicio [tipo_lugar=" + tipo_lugar + ", id_lugar=" + id_lugar 
            + ", empleados_asignados=" + empleados_asignados + "]";
    }
}

	



