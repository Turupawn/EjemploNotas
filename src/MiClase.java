import java.util.Scanner;

public class MiClase {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Ingrese nota1: ");
		double nota1 = s.nextDouble();
		
		System.out.print("Ingrese nota2: ");
		double nota2 = s.nextDouble();
		
		System.out.print("Ingrese nota3: ");
		double nota3 = s.nextDouble();
		
		System.out.print("Promedio: "+(nota1+nota2+nota3)/3);
	}

}
