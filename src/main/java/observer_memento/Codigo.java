package observer_memento;

public class Codigo {
	private int lineas;
	private String titulo;

	public Codigo(int lineas, String titulo) {
		this.lineas = lineas;
		this.titulo = titulo;
	}

	public int getLineas() {
		return lineas;
	}

	public void setLineas(int lineas) {
		this.lineas = lineas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void info() {
		System.out.println("Lineas de codigo: " + lineas);
		System.out.println("Commit: " + titulo);
	}

}
