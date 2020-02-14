package examenFEB;

import java.util.Scanner;

/**
 * Realizar algortimo que solicite un dia de la semana en texto y devolver su número
 * @author obuen
 *
 */
public class Ej2ConvertirDias {
/**
 * 
 * @param resultado
 * @param diaNumero
 * @param diaNombre
 * @param diaSolicitado
 * 
 */
	public static void main(String[] args) {
		String diaSolicitado;
		int resultado;
		int[] diaNumero={1,2,3,4,5,6,7};
		String[] diaNombre ={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		resultado=0;
		Scanner entrada_escaner = new Scanner(System.in);
		System.out.println("Introduzca un día de la semana [\"Lunes\",\"Martes\",\"Miercoles\",\"Jueves\",\"Viernes\",\"Sabado\",\"Domingo\"] :");
		diaSolicitado=entrada_escaner.nextLine();
		for (int i = 0; i < diaNombre.length; i++) {
			if (diaSolicitado.contentEquals(diaNombre[i])) {
				resultado=diaNumero[i];
			}
		}
		if (resultado==0) {
			System.out.println("Entrada no valida");
		}else {
			System.out.println(resultado);
		}
		
		entrada_escaner.close();
	}

}
