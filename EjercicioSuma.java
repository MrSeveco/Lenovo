import java.util.Scanner;

public class EjercicioSuma {

	public static void main(String[] args) 
	{
		int resultado = 0;
       Scanner Guarda = new Scanner(System.in);		
       System.out.print("Escriba un número: ");
       int num1 = Guarda.nextInt();
       
       System.out.print("Escriba otro número: ");
       int num2 = Guarda.nextInt();
       
       resultado = num1 + num2;
       
       System.out.println("La suma de los dos números ingresados es: " + resultado);
	}

}
