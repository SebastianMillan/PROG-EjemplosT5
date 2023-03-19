package ejemploLambda13;

public class Alumno {

	private int id;
	private String nombre;
	private boolean repetidor;
	public Alumno(int id, String nombre, boolean repetidor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.repetidor = repetidor;
	}
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", repetidor=" + repetidor + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isRepetidor() {
		return repetidor;
	}
	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}
	
	
}
