package cl.electrodomesticos.web;

import java.util.ArrayList;
import java.util.Scanner;
import cl.electrodomesticos.Electrodomestico;
import cl.electrodomesticos.Lavadora;
import cl.electrodomesticos.Television;

public class Comprar {

	public static void main(String[] args) {

		ArrayList<Electrodomestico> Articulo = new ArrayList<Electrodomestico>();
		ArrayList<Lavadora> ArticuloL = new ArrayList<Lavadora>();
		ArrayList<Television> ArticuloTV = new ArrayList<Television>();
		int numeroE = 0, numeroL = 0, numeroTV = 0, numeroTotal = 0;
		Scanner entrada = new Scanner(System.in);
		int tipo, consumo, tamano, carga, resolucion, totalE = 0, totalL = 0, totalTV = 0;
		boolean sintonizador;
		String respuesta;

		do {

			System.out.println("");
			System.out.print("(1: Electrodomestico / 2: Lavadora / 3: Televisor)" + "\nTipo: ");
			tipo = entrada.nextInt();
			System.out.println("");

			if (tipo == 1) {

				Electrodomestico articulo = new Electrodomestico();
				System.out.println("Electrodoméstico # " + (numeroE + 1));
				System.out.print("(1: A / 2: B / 3: C / 4: D / 5: E / 6: F)" + "\nConsumo: ");
				consumo = entrada.nextInt();
				System.out.println("");
				System.out.print("(0 a 100)" + "\nTamaño: ");
				tamano = entrada.nextInt();
				articulo.precioFinal(consumo, tamano);
				Articulo.add(numeroE, articulo);
				numeroE++;

			} else if (tipo == 2) {

				Electrodomestico articuloE = new Electrodomestico();
				Lavadora articuloL = new Lavadora();				
				System.out.println("Lavadora # " + (numeroL + 1));
				System.out.print("(1: A / 2: B / 3: C / 4: D / 5: E / 6: F)" + "\nConsumo: ");
				consumo = entrada.nextInt();
				System.out.println("");
				System.out.print("(0 a 100)" + "\nTamaño: ");
				tamano = entrada.nextInt();
				System.out.println("");
				System.out.print("(0 a 100 kg)" + "\nCarga: ");
				carga = entrada.nextInt();
				articuloL.precioFinal(carga, articuloE.precioFinal(consumo, tamano));
				ArticuloL.add(numeroL, articuloL);
				numeroL++;

			} else if (tipo == 3) {
				
				Electrodomestico articuloE = new Electrodomestico();
				Television articuloTV = new Television();				
				System.out.println("Televisión # " + (numeroTV + 1));
				System.out.print("(1: A / 2: B / 3: C / 4: D / 5: E / 6: F)" + "\nConsumo: ");
				consumo = entrada.nextInt();
				System.out.println("");
				System.out.print("(0 a 100)" + "\nTamaño: ");
				tamano = entrada.nextInt();
				System.out.println("");
				System.out.print("(0 a 100)" + "\nResolución: ");
				resolucion = entrada.nextInt();
				System.out.println("");
				System.out.print("(S/N)" + "\nSintonizador: ");				
				respuesta = entrada.next();	
				
				if (respuesta.equalsIgnoreCase("S")) {
					sintonizador = true;
				} else {
					sintonizador = false;
				}
				
				articuloTV.precioFinal(resolucion, sintonizador, articuloE.precioFinal(consumo, tamano));
				ArticuloTV.add(numeroTV, articuloTV);
				numeroTV++;
			}
			numeroTotal++;

		} while (numeroTotal < 2);

		for (Electrodomestico articulo : Articulo) {			
			totalE += articulo.precioBase;
		}

		for (Lavadora articulo : ArticuloL) {
			totalL += articulo.precioLavadora;
		}

		for (Television articulo : ArticuloTV) {
			totalTV += articulo.precioTV;
		}

		System.out.println("----------------------------------------");
		System.out.println("Precio Electrodomesticos: " + totalE);
		System.out.println("Precio Lavadoras: " + totalL);
		System.out.println("Precio Televisores: " + totalTV);
		System.out.println("----------------------------------------");
		System.out.println("TOTAL COMPRA: " + (totalL + totalE + totalTV));

	}

}
