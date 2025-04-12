package Empleados;

public class Personal {
	    private int id_personal;
	    private String identificacion;
	    protected String nombre;
	    private String apellido;
	    private int id_cargo;
	    private String usuario;
	    protected String password;
	    private String telefono;
	    private String correo;
	    private int edad;
	    private String fecha_de_ingreso;
	    private String activo;
	    
		public Personal(int id_personal, String identificacion, String nombre, String apellido, int id_cargo,
				String usuario, String password, String telefono, String correo, int edad, String fecha_de_ingreso,String activo) {

			this.id_personal = id_personal;
			this.identificacion = identificacion;
			this.nombre = nombre;
			this.apellido = apellido;
			this.id_cargo = id_cargo;
			this.usuario = usuario;
			this.password = password;
			this.telefono = telefono;
			this.correo = correo;
			this.edad = edad;
			this.fecha_de_ingreso = fecha_de_ingreso;
			this.activo = activo;
		}

		public int getId_personal() {
			return id_personal;
		}

		public void setId_personal(int id_personal) {
			this.id_personal = id_personal;
		}

		public String getIdentificacion() {
			return identificacion;
		}

		public void setIdentificacion(String identificacion) {
			this.identificacion = identificacion;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public int getId_cargo() {
			return id_cargo;
		}

		public void setId_cargo(int id_cargo) {
			this.id_cargo = id_cargo;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getFecha_de_ingreso() {
			return fecha_de_ingreso;
		}

		public void setFecha_de_ingreso(String fecha_de_ingreso) {
			this.fecha_de_ingreso = fecha_de_ingreso;
		}

		public String getActivo() {
			return activo;
		}

		public void setActivo(String activo) {
			this.activo = activo;
		}

		@Override
		public String toString() {
			return "Personal [id_personal=" + id_personal + ", identificacion=" + identificacion + ", nombre=" + nombre
					+ ", apellido=" + apellido + ", id_cargo=" + id_cargo + ", usuario=" + usuario + ", password="
					+ password + ", telefono=" + telefono + ", correo=" + correo + ", edad=" + edad
					+ ", fecha_de_ingreso=" + fecha_de_ingreso + ", activo=" + activo + "]";
		}
	    
		
	    
}
