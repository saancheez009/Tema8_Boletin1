package ejercicio3;

public class Productos {
	
	protected String nombre;
	protected double precio;
/**
 * 
 */
	public Productos() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @param nombre
 * @param precio
 */
	public Productos(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
/**
 * 
 * @return
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return
 */
	public double getPrecio() {
		return precio;
	}
/**
 * 
 * @param precio
 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

/**
 * 
 * @param cantidad
 * @return
 */
	public double calcular(int cantidad) {
		return cantidad * precio;
	}

	
	@Override
	public String toString() {
		return nombre + ", " + precio;
	}

}
