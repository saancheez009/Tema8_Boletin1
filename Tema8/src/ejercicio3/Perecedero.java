package ejercicio3;

public class Perecedero extends Productos {
	

	int diasCaducar=0;

	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(String nombre, double precio, int diasCaducar) {
		super(nombre, precio);
		if (diasCaducar > 0) {
			this.diasCaducar = diasCaducar;
		}
	}
	public Perecedero(int diasCaducar) {
		super();
		this.diasCaducar = diasCaducar;
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}

	@Override
	public double calcular(int cantidad) {
		double result = super.calcular(cantidad);

		if (diasCaducar == 1) {
			result /= 4;
		} else if (diasCaducar == 2) {
			result /= 3;
		} else if (diasCaducar == 3) {
			result /= 2;
		}

		return result;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + diasCaducar;
	}
	
	
}
