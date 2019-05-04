package lista2_3;

public class Main {

	public static void main(String[] args) {
		
		int[][] distancias = {{0,15,30,5,12},{15,0,10,17,28},{30,10,0,3,11},{5,17,3,0,80},{12,28,11,80,0}};
		int[] percurso = {1, 2, 3, 2, 5, 1, 4};
		int distancia = 0;

		System.out.print("Percurso :"+percurso[0]);
		for (int i = 0; i < percurso.length-1; i++) {
			int a,b;
			a = percurso[i];
			b = percurso[i+1];
			distancia += distancias[a-1][b-1];
			System.out.print("->"+b);
		}
		
		System.out.println();
		System.out.println("Distância percorrida: "+distancia+"km");
		
	}

}
