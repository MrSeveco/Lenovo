import java.util.Random;
public class Arrays {
	
	public static void main(String[] args) {
		
		//EjNombreEdadSexo();
		//MatrizRandom();
		//SumaMatrices();

	}

	public static void EjNombreEdadSexo() {
		
		String[] nombres  = {"Martha","Julian","Maria ","Pedro "};
		int[] edad = {19,45,12,31};
		char[] Sexo = {'F','M','F','M'};
		
		System.out.println("NOMBRE   EDAD   SEXO");
		for (int i = 0; i <= 3; i++) {
			System.out.println(nombres[0+i]+ "    " + edad[0+i] + "      "+ Sexo[0+i]);
			
		}
	}
	public static void MatrizRandom() {
		int[][] numale = new int[20][10];
		Random ale = new Random();
		for(int i = 0; i < 10; i++) 
		{
		for	(int j = 0; j < 20; j++)
		{
			numale[j][i] = ale.nextInt(10, 100);
			System.out.print(numale[j][i] + "|");
		}
		System.out.println("");
		}	
	}
	public static void SumaMatrices() {
		int [][] num = new int [5][4];
		Random Aleatorio = new Random();
		int SumaFilas = 0, SumaColumnas = 0, SumaTotalF = 0, SumaTotalC = 0, SumaTOTAL = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<5; j++) {
				num [j][i] = Aleatorio.nextInt(0, 9);
				System.out.print(num[j][i] + " | ");
				SumaFilas = SumaFilas + num[j][i];
				SumaTotalF += num [j] [i];
			}
			
			System.out.print(SumaFilas);
			System.out.println("");
			SumaFilas = 0;
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<4; j++) {
				SumaColumnas = SumaColumnas + num[i][j];
				SumaTotalC += num [i][j];
			}
			System.out.print(SumaColumnas + "  ");
			SumaColumnas = 0;
		}
		SumaTOTAL = SumaTotalC + SumaTotalF;
		System.out.println(SumaTOTAL);
	}
}
