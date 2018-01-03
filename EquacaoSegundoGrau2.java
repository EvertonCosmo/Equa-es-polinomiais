

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquacaoSegundoGrau2 extends SegundoGrau{

	static Scanner leitor = new Scanner(System.in);

	static void InterseccaoPrimeiroSegundo() {

		double a=0, b=0,c=0, // Segundo grau  
				A=0,B=0; // Primeiro Grau

		/*===PRIMEIRO GRAU===*/
		try {
			System.out.println("EQUAÇÃO: (ax+b=0)");
			System.out.print("Digite o coeficiente A: ");
			A = leitor.nextDouble(); // Usado para pegar o valor double
			System.out.print("Digite o coeficiente B: ");
			B = leitor.nextDouble(); // Usado para pegar o valor double
			
			/*===SEGUNDO GRAU====*/
			System.out.println("EQUAÇÃO: ax² + bx + c");
			
			System.out.print("Coeficiente A, que seja diferente de zero : ");
			a = leitor.nextDouble();

			System.out.print("Coeficiente B: ");
			b = leitor.nextDouble();

			System.out.print("Coeficiente C: ");		
			c = leitor.nextDouble();
			
		}catch(InputMismatchException e) {
			System.out.println("DIGITE SOMENTE NÚMEROS");
		}
				
		b = b - A;
		c = c - B;
		// Calcula as raízes da equacão do segundo grau
		raízes(a, b, c);
		
		
		 
		
		
		double resultado1 = (A * x1) + B;
		double resultado2 = (A * x2) + B;
		
		/*===== MOSTRA A INTERSECÇÃO DAS EQUAÇÕES====*/
		System.out.printf("Elas se interceptam em: %f , %f \n",resultado1,resultado2);





	}

}
