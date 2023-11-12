import java.util.ArrayList;
import java.util.List;

public class Casa {
	private int numero;
	private String condominio;
	private final List<Empleado> empleados = new ArrayList<>(); // Usar List en lugar de Vector

	public Casa() {
		// Puedes dejar el constructor vacío o agregar lógica adicional si es necesario
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCondominio() {
		return this.condominio;
	}

	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}

	public List<Empleado> getEmpleados() {
		return this.empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	public void eliminarEmpleado(Empleado empleado) {
		this.empleados.remove(empleado);
	}
}
