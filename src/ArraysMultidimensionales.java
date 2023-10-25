
public class ArraysMultidimensionales {

	public static void main(String[] args) {


		//[15][6][62]
		//[61][62][62]
		//[54][84][32]
		
		int[][] arrayBidiEnteros = new int[3][3]; //numero de casillas 3x3
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				arrayBidiEnteros[i][j] = (i*10)+j;
			}
			
		}
		


		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arrayBidiEnteros[i][j]);;
			}
			
		}
			
		
	}

}
