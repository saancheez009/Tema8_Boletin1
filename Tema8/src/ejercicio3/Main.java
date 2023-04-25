package ejercicio3;

public class Main {

	public static void main(String[] args) {
		int cant = 5;
		double sumaProductos = 0;
		double sumaPrecio = 0;
		double sumaPrecio2 = 0;

		Productos[] producto = new Productos[10];

		producto[0] = new NoPerecedero("Galletas", 1.20, "Maria");
		producto[1] = new NoPerecedero("Café", 6.50, "Grano");
		producto[2] = new NoPerecedero("ColaCao", 7.99, "Colacao");
		producto[3] = new NoPerecedero("Vino", 1.50, "tinto");
		producto[4] = new NoPerecedero("Arroz", 1.99, "Largo");
		producto[5] = new Perecedero("Yogurt", 2.99, 2);
		producto[6] = new Perecedero("Bebida de Soja", 3.99, 2);
		producto[7] = new Perecedero("Tomate", 1.99, 3);
		producto[8] = new Perecedero("Caldo de sopa", 0.99, 1);
		producto[9] = new Perecedero("Mantequilla", 2.95, 3);

		for (int i = 0; i < producto.length; i++) {

			sumaPrecio = producto[i].calcular(cant);
			sumaProductos += sumaPrecio;
			System.out.println(producto[i]);
			System.out.println();
			System.out.println("Precio total de cada producto: " + sumaPrecio);
			System.out.println("---------------------------------------");
		}

		System.out.println("La suma total de precios es de " + sumaProductos);

	}

}
