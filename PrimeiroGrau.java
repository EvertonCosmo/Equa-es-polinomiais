import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeiroGrau {
	static Scanner leitor = new Scanner(System.in);
	
static void PrimeiroG(){
		double valorA, valorB, x ;
				 
				 	
		/*==========LÊ DADOS DO TECLADO========*/
		try {
		System.out.println("Equacao: (ax+b=0)");
		System.out.print("Digite o coeficiente A: ");
		valorA = leitor.nextDouble(); // Usado para pegar o valor double
		System.out.print("Digite o coeficiente B: ");
		valorB = leitor.nextDouble(); // Usado para pegar o valor double

		x = (-valorB/valorA); // variável x = recebe o calculo da funcão afim ax+b=0 (RAIZ)
		int cresDec=valueA(valorA); // variável cresDec recebe o retorno se a é crescente ou decrescente

		
		System.out.println("(1)CRESCENTE,\n(0)DECRESCENTE,\nVALOR: "+cresDec); // Mostra o valor de cresDec
		System.out.println("Raiz: "+ x); // Mostra o valor da raíz (X)
		
		}catch(InputMismatchException e) {
			System.out.println("DIGITE SOMENTE NÚMEROS");
		}
}


	/*====MÉTODO PARA VERIFICAR(a) SE É CRESCENTE OU DECRESCENTE====*/

		
	static int valueA(double a){
		/*Retorna 1 se a > 0, 0 se a < 0 e -1 se não for igual a 0*/
		if(a > 0) {
			return 1;
		}else if( a < 0) {
			return 0;
		}
		return -1;
	}

}
