package ejercicio3;

public class NoPerecedero extends Productos{
	String tipo;
/**
 * 
 */
	public NoPerecedero() {
		super();
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @param nombre
 * @param precio
 * @param tipo
 */
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;

	}

/**
 * 
 * @param tipo
 */
	public NoPerecedero(String tipo) {
		super();
		this.tipo = tipo;
	}
/**
 * 
 * @return
 */
	public String getTipo() {
		return tipo;
	}
/**
 * 
 * @param tipo
 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public double calcular(int cantidad) {
		return super.calcular(cantidad);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + tipo;
	}

}
