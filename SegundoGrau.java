import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 	Everton Cosmo & Lazaro 
 * 
 * 
 * */


public class SegundoGrau {
	
	/*---- Usadas para controlar o valor de x1 e x2  -------*/
	protected static double x1;  // variável para guardar x1 - RAIZ
	protected static double x2; // variável para guardar x1 - RAIZ
	
	static Scanner leitor = new Scanner(System.in);// Scanner que tem como entrada padrão o teclado
	
	static void SegundoGrauUm() {
		double a,b,c; // Variáveis para a, b e c (Coeficientes)
		
		try {
			System.out.println("EQUAÇÃO: ax²+bx+c");
			System.out.print("Coeficiente A: ");
			a = leitor.nextDouble();

			if(a!=0) {
				System.out.print("Coeficiente B: ");
				b = leitor.nextDouble();

				System.out.print("Coeficiente C: ");		
				c = leitor.nextDouble();

				raízes(a, b, c); // Calcula raízes e mostra quantas são, se existir 
				calculaXv(a, b); // Calcula x do vértice e mostra

			}else {
				System.out.println("Valor do coeficiente 'a' inválido. Não é uma equação do segundo grau");
			}
			/*=====MOSTRA OS INTERVALOS DA EQUACAO COM BASE O COEFICIENTE 'a'=====*/
			if( a > 0) {
				System.out.println("O intervalo negativo é entre: " + "x < " + x2+ " e " + "x1 < " +x1 );
				System.out.println("O intervalo positivo é entre: " + "x < " + x2+ " e " + "x1 > " +x1 );


			}else if(a < 0) {
				System.out.println("O intervalo positivo é entre: " + "x < " + x2+ " e " + "x1 < " +x1 );
				System.out.println("O intervalo negativo é entre: " + "x < " + x2+ " e " + "x1 > " +x1 );
			}
			
		}catch(InputMismatchException e) {
			System.out.println("DIGITE SOMENTE NÚMEROS");
		}



	}
	/*====CALCULA O DELTA ===*/
	static double delta(double a,double b, double c) {
		// RETORNA O VALOR DA EQUAÇÃO (b²-4 x a x c) 
		return  Math.pow(b, 2) - (4* a * c);
	}

	static void calculaXv(double a, double b) {
		double xv = (-b)/(2*a); // xv armazena o valor da equacão do x do vértice

		if(a >0) { // Mostra os intervalos se a > 0 (CONCAVIDADE PARA CIMA)
			System.out.println("x > "+xv+" é crescente");
			System.out.println("x < "+xv+" é decrescente");
			System.out.println("x = " +xv+" é constante");
		}
		if(a <0) { // Mostra os intervalos se a > 0 (CONCAVIDADE PARA BAIXO)
			System.out.println("x > "+xv+" é decrescente");
			System.out.println("x < "+xv+" é crescente");
			System.out.println("x = " +xv+" é constante");
		}

	}


	/*=======CALCULA O BHASKARA========*/
	static void raízes(double a, double b, double c) {

		double delta = delta(a, b, c); // Variável delta recebe o o valor do cálculo de DELTA
		System.out.println("DELTA:"+delta); // Mostra delta no console
		
		/*======VERIFICAÇÃO DE DELTA======*/
		if(delta < 0) { 
			System.out.println("Não possui raízes reais. (DELTA < 0)");Menu.main(null);
		}else if(delta == 0) {
			System.out.println("Raízes iguais"); Menu.main(null);

		}

		/*=====CALCULA AS RAÍZES=====*/
		x1 = (-b+Math.sqrt(delta))/ (2.0 *a); 
		x2 = (-b-Math.sqrt(delta))/ (2.0 *a);

		System.out.println("X¹: "+x1); // Mostra x1 (RAÍZ)
		System.out.println("X²: "+x2); // Mostra x2 (RAÍZ)
		

	}


}
