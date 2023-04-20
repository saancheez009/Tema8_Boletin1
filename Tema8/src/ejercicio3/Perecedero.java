package ejercicio3;

public class Perecedero extends Productos {
	

	int diasCaducar;

	public Perecedero() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perecedero(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
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
	public String toString() {
		return "Perecedero [diasCaducar=" + diasCaducar + "]";
	}
	
	
}
