package ejercicio2;

public class Empleado {
	
	private String nombre;

	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre="";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		
		return "Empleado "+nombre;
	
	}

}
