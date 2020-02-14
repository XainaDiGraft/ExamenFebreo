package examenFEB;

public class Ej6Array2D {

	public static void main(String[] args) {
		int[][] diagonal;
		diagonal=new int[4][4];
		for (int i = 0; i < diagonal.length; i++) {
			for(int k=0; k < diagonal.length;k++) {
				diagonal[i][k]=0;
			
				if (i==k) {
					for(int j=diagonal.length;j >= 0;i--) {
						diagonal[i][i]=j;
					}
				}
			}
		}

	}

}
