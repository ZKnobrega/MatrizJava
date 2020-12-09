import java.lang.Math;

public class MatizSoma {

	public static void main(String[] args) {
		int Matriz[][] = new int [20][10];
		int SomaColuna[] = new int [10];
		
		for (int l = 0; l<20; l++) {
			for(int c = 0; c<10; c++) {
				Matriz[l][c] = (int) (Math.random()*100);
				SomaColuna[c] = SomaColuna[c] + Matriz[l][c];
			}
		}
		
		for (int l = 0; l<20; l++) {
			for (int c = 0; c < 10; c++  ) {
				System.out.printf("\t %d \t", Matriz[l][c]);
			}
			System.out.println("");
		}
	}

}
