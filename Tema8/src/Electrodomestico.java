
public class Electrodomestico {
	
	int precioBase;
	
	String[][] color = {{"Blanco", "Negro", "Rojo", "Azul", "Gris"}};
	
	//Entre la A y la E el consumo energético
	String consumoE;
	
	int peso;

	public Electrodomestico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(int precioBase, String[][] color, String consumoE, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoE = consumoE;
		this.peso = peso;
	}

	

}
