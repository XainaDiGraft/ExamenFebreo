package examenFEB;

import java.util.Scanner;

public class Ej4Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usuario="IMF";
		String contrase�a="12345";
		String usuarioRecibido,contrase�aRecibida;
		Scanner entrada_escaner= new Scanner(System.in);
		for (int i = 1; i < 6; i++) {
			System.out.println("Introduzca usuario:");
			usuarioRecibido=entrada_escaner.nextLine();
			System.out.println("Introduzca contrase�a:");
			contrase�aRecibida=entrada_escaner.nextLine();
			if (usuarioRecibido.contentEquals(usuario)||contrase�aRecibida.contentEquals(contrase�a)) {
				System.out.println("Aceso permitido");
				System.exit(0);
			}else {
				System.out.println("Aceso denegado");
			}
				
		}
		System.out.println("Aceso Bloqueado");
		
		entrada_escaner.close();
	}

}
