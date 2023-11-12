import java.util.ArrayList;
import java.util.List;

public class Condominio {
	private String nombre;
	private List<Casa> casas;

	public Condominio() {
		this.casas = new ArrayList<>(); // Inicializar la lista en el constructor por defecto
	}

	public String getNombre() {
		return this.nombre;
	}

	public List<Casa> getCasas() {
		return this.casas;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCasas(List<Casa> casas) {
		this.casas = casas;
	}

	public Condominio(List<Casa> casas) {
		this.casas = casas;
	}
}
