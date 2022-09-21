
public class Arrays {

	public static void main(String[] args) {
		
		EjNombreEdadSexo();
		

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
}
