package examenFEB;

import java.util.Scanner;

public class EjFuncionesArray {

	public static void main(String[] args) {
		int dimension;
		int[] vector;
		Scanner entrada_escaner= new Scanner(System.in);
		System.out.println("Introduce el tamaño del Array:");
		dimension=entrada_escaner.nextInt();
		vector=new int[dimension];
		mostrar (vector);
		inicializar(vector);
		mostrar (vector);
		
		
		entrada_escaner.close();
	}
	public static void mostrar(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
	}
	public static void inicializar(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			vector[i]=-1;
			
		}
	}
	public boolean insertar(int[] vector,int posicion,int valor) {
		boolean insertado;
		if (posicion>vector.length||posicion<0) {
			insertado =false;
		}
		
		
		return insertado;
	}
}
