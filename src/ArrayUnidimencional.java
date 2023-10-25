import java.util.Iterator;

public class ArrayUnidimencional {

	public static void main(String[] args) {
		// array o vector o arreglo [{}, 5, "hola"]
		
		//estructuras de datos 1.Estaticos o 2.Dinamicos
		
		//Array unidimencionales (nos enfocaremos en este)/ Arrays multidimencionales
		
		//unidimencional 
		int[] arrayEnteros;
		//se requiere hacer una construccion del array
		arrayEnteros = new int[10];
		//que es lo mismo int[] arrayEnteros = new int[10];
		
		arrayEnteros[0] = 0;
		arrayEnteros[1] = 0;
		arrayEnteros[2] = 0;
		arrayEnteros[9] = 0;
		
		for(int i = 0; i < 10; i++) {
			arrayEnteros[i] = i * 2;
			
		}
		//arrayEnteros[0] = 45; ESCRITURA
		//numero = arrayEnteros[0]; LECTURA
		System.out.println(arrayEnteros[9]);
		arrayEnteros[9] = arrayEnteros[7] + arrayEnteros[8];
		System.out.println(arrayEnteros[9]);
		
		//construccion declaracion e inicializacion directa de arrays
		
		char[] arrayNombre = {'J', 'o', 's', 'e'};
		double[] arrayReales = {11, 22, 55, 1};
		
		
		
		
		
		
		

	}

}
