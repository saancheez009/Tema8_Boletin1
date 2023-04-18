package ejercicio3;

public class Productos {
	
	String nombre;
	
	int precio;

	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Productos(String nombre, int precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
