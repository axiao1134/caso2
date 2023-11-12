import java.util.Vector;

public class Persona extends Empleado {
	private static final GrupoDeProyecto grupoProyecto = new GrupoDeProyecto(); // Corregido la inicialización
	private String nombre;
	public Vector<Moto> motos = new Vector<Moto>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Persona() {
		super(grupoProyecto);
		// Puedes dejar el constructor vacío o agregar lógica adicional si es necesario
	}
}
