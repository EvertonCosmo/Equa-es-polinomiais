
import java.util.InputMismatchException;
import java.util.Scanner;

public class EquacaoPrimeiroGrau2{ 
	static Scanner scan = new Scanner(System.in); 

	static void PrimeiroGDois() {

		double a,b,A,B,x,y;
		try {
			System.out.println("Primeira equacao: ");
			System.out.println("Coeficiente a: ");
			a = scan.nextDouble();

			System.out.println("Coeficiente b: ");
			b = scan.nextDouble();

			System.out.println("Coeficiente A: ");
			A = scan.nextDouble();

			System.out.println("Coeficiente B: ");
			B = scan.nextDouble(); 

			// Primeiro caso 
			//		y = (-b/a);
			
			if(a==A && b==B) {
				System.out.println("A reta é a próṕria interseccção");Menu.main(null);
			}

			if((A % a != 0 || a % A !=0 ) && (B % b ==0|| b % B ==0)) {
				if(((a > 0 && A > 0) || (a < 0 && A < 0 )) && ((b > 0 && B > 0) || (b < 0 && B < 0))) {
					System.out.println("Não há intersecção das retas\n"); Menu.main(null);
				}
			}

			x = ((-b+B)/(a-A)); 
			y = (A*x)+B;
			
			System.out.println("x:"+x+" y:"+y);
			
		}catch(InputMismatchException e) {
			System.out.println("DIGITE SOMENTE NÚMEROS");
		}

	}
}

