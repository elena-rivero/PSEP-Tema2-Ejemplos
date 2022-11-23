package ejerciciolibro;

public class Libro {
	private int id;
	private boolean enUso = false;
	
	public Libro(int id, boolean enUso) {
		super();
		this.id = id;
		this.enUso = enUso;
	}

	public boolean isEnUso() {
		return enUso;
	}

	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}
	
	
	
}
