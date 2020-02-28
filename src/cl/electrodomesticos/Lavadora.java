package cl.electrodomesticos;

public class Lavadora extends Electrodomestico {

	private static int CARGA = 5;
	private static int PRECIO_LAVADORA;
	private int carga;
	public int precioLavadora;

	/**
	 * Contructor por defecto
	 */
	public Lavadora() {		
		this(PRECIO_BASE, PESO, CONSUMO_ENERGETICO, COLOR, CARGA, PRECIO_LAVADORA);
	}
	
	/**
	 * Constructor con 2 parametros 
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		COLOR = "Blanco";
		CONSUMO_ENERGETICO = 'F';
		CARGA = 5;
	}

	/**
	 * Constructor con 5 parametros	 
	 * @param precioBase
	 * @param peso
	 * @param consumoEnergetico
	 * @param color
	 * @param carga
	 */
	public Lavadora(int precioBase, double peso, char consumoEnergetico, String color, int carga, int precioLavadora) {
		super(color,consumoEnergetico, precioBase, peso);
		this.carga = carga;
		this.precioLavadora = precioLavadora;
	}
		
	/**
	 * Método para calcular el precio de cada televisor
	 * @param precioBase Precio según parámetros de electrodoméstico
	 * @param carga Carga de la lavadora
	 */
	public int precioFinal(int carga, int precioBase) {
				
		if (carga > 30) {
			setPrecioLavadora(precioBase + 50);
		}else {
			setPrecioLavadora(precioBase);
		}
		return getPrecioLavadora();
	}

	/**
	 * @return Devuelve el precio de la lavadora
	 */
	public int getPrecioLavadora() {
		return precioLavadora;
	}

	/**
	 * @param precioLavadora Recibe el precio de la lavadora
	 */
	public void setPrecioLavadora(int precioLavadora) {
		this.precioLavadora = precioLavadora;
	}
	
	/** 
	 * @return Devuelve la carga de la lavadora	
	 */
	public int getCarga() {
		return carga;
	}	
	
}
