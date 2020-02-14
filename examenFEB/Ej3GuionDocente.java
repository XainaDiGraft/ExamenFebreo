package examenFEB;

import java.util.Scanner;

/**
 * 
 * Calculo de calificacion final de la materia de programacion 
 * promedio de boletines es 60%
 * examen final es 40%
 * Dadas las notas de los tres boletines y la del examen final
 * validar que las noras están entre 0 y 10
 * Calcular la media de los boletines
 * Calcular la nota final
 * Mostrar la nota en número y texto 
 * Numero          Texto
 * 0.0-4.999999   Suspenso
 * 5.0-5.999999   Suficiente
 * 6.0-6.999999   Bien
 * 7.0-8.999999   Notable
 * 9.0-10.0       Sobresaliente
 * 
 * @author obuen
 *
 */
public class Ej3GuionDocente {

	public static void main(String[] args) {
		double[] boletin;
		boletin=new double[3];
		double  examenFinal, mediaBoletines,notaFinal;
		String entrada;
		Scanner entrada_escaner= new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduzca nota boletin"+ (i+1) + ":");
			entrada=entrada_escaner.nextLine();
			entrada = entrada.replaceAll(",",".");
			boletin[i]=(Double) Double.parseDouble(entrada);
			comprobarDatos (boletin[i]);
		}
		System.out.println("Introduzca nota examen:");
		entrada=entrada_escaner.nextLine();
		entrada = entrada.replaceAll(",",".");
		examenFinal=(Double) Double.parseDouble(entrada);
		comprobarDatos (examenFinal);
		
		mediaBoletines=(boletin[0]+boletin[1]+boletin[2])/3;
		System.out.println("Media de la nota de los boletines:" + mediaBoletines);
		notaFinal=mediaBoletines*0.6+examenFinal*0.4;
		System.out.println("Nota final:" + notaFinal);
		if (notaFinal<5.0) {
			System.out.println("Nota fina: Suspenso");
		}
		if (notaFinal>=5.0 && notaFinal<6.0) {
			System.out.println("Nota fina: Suficiente");		
		}
		if (notaFinal>=6.0 && notaFinal<7.0) {
			System.out.println("Nota fina: Bien");		
		}
		if (notaFinal>=7.0 && notaFinal<9.0) {
			System.out.println("Nota fina: Notable");		
		}
		if (notaFinal>=9.0 && notaFinal<=10.0) {
			System.out.println("Nota fina: Sobresaliente");		
		}
		entrada_escaner.close();
	}
	public static void comprobarDatos(double valor) {

			if (valor<0.0||valor>10.0) {
				System.out.println("Datos introducidos son erroneos");
				System.exit(0);
			}
	}

}
