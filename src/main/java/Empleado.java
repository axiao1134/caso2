public class Empleado {
	private String puesto;
	private String departamento;
	private final GrupoDeProyecto casa;

	public String getPuesto() {
		return this.puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Empleado(GrupoDeProyecto casa) { // Cambiado el parámetro de GrupoDeProyecto a Casa
		this.casa = casa;
	}
}
