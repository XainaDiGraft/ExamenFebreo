package examenFEB;

import java.util.Scanner;

/**
 * 
 * Priemer ejercicio del examen de programación
 *Programa que realice la facturación de una copistería
 * @author obuen
 * 
 */
public class Ej1Copisteria {
/**
 * 
 * @param NumCopias
 * @param importe
 */
	public static void main(String[] args) {
		int NumCopias;
		String entrada;
		Double importe;
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("Ingrese número de fotocopias:");
		
		entrada = entrada_escaner.nextLine();
		entrada = entrada.replaceAll(",",".");
		NumCopias = (int) Double.parseDouble(entrada);
		NumCopias=Math.abs(NumCopias);
		
		if (NumCopias>500) {
			importe=NumCopias*0.03;
		} else {
			importe=NumCopias*0.05;
		}
		System.out.println("La factura se de:"+ importe);
		
		entrada_escaner.close();
	}

}
