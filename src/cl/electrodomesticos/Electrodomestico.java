package cl.electrodomesticos;

public class Electrodomestico {

	protected static String COLOR = "Blanco";
	protected static char CONSUMO_ENERGETICO = 'F';
	protected static int PRECIO_BASE = 100;
	protected static double PESO = 5;
	public int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		this(COLOR, CONSUMO_ENERGETICO, PRECIO_BASE, PESO);
	}
	
	/**
	 * Contructor con 2 parametros	 
	 * @param precioBase del electrodomestico
	 * @param peso del electrodomestico
	 */
	public Electrodomestico(int precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		CONSUMO_ENERGETICO = 'F';
		COLOR = "Blanco";
	}

	/**
	 * Constructor con 4 parametros	 
	 * @param color del electrodomestico
	 * @param peso del electrodomestico
	 * @param precioBase del electrodomestico
	 * @param peso del electrodomestico
	 */
	public Electrodomestico(String color, char consumoEnergetico, int precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;	
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
	}

	/**
	 * Método que comprueba que el consumo energético sea válido
	 * @param consumo Recibe el consumo energético solicitado
	 * @return Devuelva un boiolean que valida el consumo energético
	 */
	public boolean comprobarConsumoEnergetico(char consumo) {

		boolean validar = false;
				
			if (consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' || consumo == 'E'
					|| consumo == 'F') {
				validar = true;
			}else {				
				this.consumoEnergetico = CONSUMO_ENERGETICO;
				validar =  false;
			}		
		return validar;
	}

	/**
	 * Método que comprueba si el color asignado es válido
	 * @param color Color solicitado
	 * @return Devuelve un boolean confirmando si el color es válido
	 */
	public boolean comprobarColor(String color) {

		boolean validar = false;

		if (color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") || color.equalsIgnoreCase("Rojo")
				|| color.equalsIgnoreCase("Azul") || color.equalsIgnoreCase("Gris")) {
			validar = true;
		}else {
			this.color = COLOR;
			validar = false;
		}
		return validar;
	}

	/**
	 * Método que modifica el precio base de cada electrodoméstico según el consumo y tamaño.
	 * @param consumo Recibe el tipo de consumo del electrodoméstico
	 * @param tamano Recibe el tamaño del electrodoméstico
	 * @return Devuelve el precio base modificado 
	 */
	public int precioFinal(int consumo, int tamano) {

		switch (consumo) {
		case 1:
			setPrecioBase(getPrecioBase() + 100000);
			break;
		case 2:
			setPrecioBase(getPrecioBase() + 80000);
			break;
		case 3:
			setPrecioBase(getPrecioBase() + 60000);
			break;
		case 4:
			setPrecioBase(getPrecioBase() + 50000);
			break;
		case 5:
			setPrecioBase(getPrecioBase() + 30000);
			break;
		case 6:
			setPrecioBase(getPrecioBase() + 10000);
			break;
		default:
			System.out.println("Valor no válido");
			break;
		}

		if (0 < tamano && tamano < 19) {
			setPrecioBase(getPrecioBase() + 10000);
		} else if (20 < tamano && tamano < 49) {
			setPrecioBase(getPrecioBase() + 50000);
		} else if (50 < tamano && tamano < 79) {
			setPrecioBase(getPrecioBase() + 80000);
		} else if (80 < tamano) {
			setPrecioBase(getPrecioBase() + 100000);
		}

		return getPrecioBase();
	}

	/** 
	 * @return Devuelve el precio base 
	 */
	public int getPrecioBase() {
		return precioBase;
	}
		
	/** 
	 * @param precioBase Modifica el precio base
	 */
	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return Devuelve el color del electrodomestico
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return Devuelve el consumo energetico del electrodomestico
	 */
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	/**
	 * @return Devuelve el peso del electrodomestico
	 */
	public double getPeso() {
		return peso;
	}
}