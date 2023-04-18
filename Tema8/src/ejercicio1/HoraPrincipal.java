package ejercicio1;

public class HoraPrincipal {

	public static void main(String[] args) {
		HoraExacta he = new HoraExacta(2,3,56);
		he.inc();
		System.out.println(he);
		
		Hora h = new Hora(3,4);
		h.inc();
		System.out.println(h);
	}

}
