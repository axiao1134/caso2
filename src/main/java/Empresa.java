import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private final List<Departamento> departamentos = new ArrayList<>(); // Cambiado Vector a List

	public Empresa() {
		// Puedes dejar el constructor vacío o agregar lógica adicional si es necesario
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Departamento> getDepartamentos() {
		return this.departamentos;
	}

	public void agregarDepartamento(Departamento departamento) {
		this.departamentos.add(departamento);
	}

	public void eliminarDepartamento(Departamento departamento) {
		this.departamentos.remove(departamento);
	}
}
