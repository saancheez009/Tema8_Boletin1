package ejercicio3;

public class NoPerecedero extends Productos{
	String tipo;

	public NoPerecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoPerecedero(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	public NoPerecedero(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "NoPerecedero [tipo=" + tipo + "]";
	}
	
	

}
