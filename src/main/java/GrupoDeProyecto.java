import java.util.ArrayList;
import java.util.List;

public class GrupoDeProyecto {
	private String nombre;
	private List<Empleado> empleados; // Corregido el tipo de la lista
	private Departamento departamento;

	public GrupoDeProyecto() {
		this.empleados = new ArrayList<>(); // Inicializar la lista en el constructor
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() { // Corregido el tipo de retorno
		return this.empleados;
	}

	public void setEmpleados(List<Empleado> empleados) { // Corregido el tipo del parámetro
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado empleado) { // Corregido el nombre del método y añadido parámetro
		this.empleados.add(empleado);
	}

	public void eliminarEmpleado(Empleado empleado) { // Corregido el nombre del método y añadido parámetro
		this.empleados.remove(empleado);
	}
}
