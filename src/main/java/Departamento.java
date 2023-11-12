import java.util.ArrayList;
import java.util.List;

public class Departamento {
	private String nombre;
	private List<Empleado> empleados;
	private Empresa empresa;
	private List<GrupoDeProyecto> grupos;

	public Departamento() {
		this.empleados = new ArrayList<>(); // Inicializar la lista en el constructor por defecto
		this.grupos = new ArrayList<>(); // Inicializar la lista de grupos en el constructor por defecto
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public List<GrupoDeProyecto> getGrupos() {
		return this.grupos;
	}

	public void setGrupos(List<GrupoDeProyecto> grupos) {
		this.grupos = grupos;
	}

	public void agregarGrupo(GrupoDeProyecto grupo) {
		this.grupos.add(grupo);
	}

	public void eliminarGrupo(GrupoDeProyecto grupo) {
		this.grupos.remove(grupo);
	}
}
