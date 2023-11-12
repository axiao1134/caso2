public class Moto {
	private String marca; // Corregido el nombre del atributo
	private String modelo;
	public Persona persona;

	public String getMarca() { // Corregido el nombre del método
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Moto() {
		// Constructor por defecto vacío
	}

	// Constructor con parámetros
	public Moto(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
}
