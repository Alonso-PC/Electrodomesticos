package cl.electrodomesticos;

public class Television extends Electrodomestico {

	private static int RESOLUCION = 20;
	private static boolean SINTONIZADOR = false;
	private static int PRECIOTV;
	private int resolucion;
	private boolean sintonizador;
	public int precioTV;

	/**
	 * Constructor por defecto
	 */
	public Television() {
		this(COLOR, CONSUMO_ENERGETICO, PRECIO_BASE, PESO, RESOLUCION, SINTONIZADOR, PRECIOTV);
	}

	/**
	 * Constructor con 2 parametros
	 * @param color del televisor
	 * @param consumoEnergetico del televisor
	 * @param precioBase del televisor
	 * @param peso del televisor
	 * @param resolucion del televisor
	 * @param sintonizador del televisor
	 */
	public Television(int precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		RESOLUCION = 20;
		SINTONIZADOR = false;
	}

	/**
	 * Contructor con 6 parametros	 * 
	 * @param precioBase precioBase del televisor
	 * @param peso peso del televisor
	 * @param consumoEnergetico consumoEnergetico del televisor
	 * @param color color del televisor
	 * @param resolucion resolucion del televisor
	 * @param sintonizadorTDT sintonizadorTDT del televisor
	 */
	public Television(String color, char consumoEnergetico, int precioBase, double peso, int resolucion,
			boolean sintonizador, int precioTV) {
		super(color, consumoEnergetico, precioBase, peso);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
		this.precioTV = precioTV;
	}

	/**
	 * Método que calcula el nuevo precio según ingreso de parámetros
	 * @param resolucion resolucion del televisor
	 * @param sintonizador sintonizadordel televisor
	 * @param precioBase precioBase del televisor
	 * @return Devuelve el precio modificado del televisor
	 */
	public int precioFinal(int resolucion, boolean sintonizador, int precioBase) {

		if (resolucion > 40 && sintonizador) {
			setPrecioTV((precioBase * ((100 / 30) + 1)) + 50);
		} else if (sintonizador) {
			setPrecioTV(precioBase + 50);
		} else if (resolucion > 40) {
			setPrecioTV(precioBase * ((100 / 30) + 1));
		} else {
			setPrecioTV(precioBase);
		}
		return getPrecioTV();
	}

	/**
	 * @return Devuelve la resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}

	/**
	 * @param resolucion Recibe la resolucion del televisor
	 */
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	/**
	 * @return Devuelve el sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

	/**
	 * @param sintonizador Recibe si el sintonizador es válido
	 */
	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	/**
	 * @return Devuelve el precio del televisor
	 */
	public int getPrecioTV() {
		return precioTV;
	}

	/**
	 * @param precioTV Recibe el precio del televisor
	 */
	public void setPrecioTV(int precioTV) {
		this.precioTV = precioTV;
	}

}
