package memento;

public class Tesis {
	private String titulo;
	private int version;

	public Tesis(String titulo, int version) {
		this.titulo = titulo;
		this.version = version;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void info() {
		System.out.println("Titulo de la tesis: " + titulo);
		System.out.println("Version de la tesis: " + version);
	}

}
