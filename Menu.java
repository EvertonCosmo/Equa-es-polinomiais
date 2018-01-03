

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*	Everton Cosmo & Lazaro 
*
*/
public class Menu {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("\n\n");
		int opcao=0;
		System.out.println(" ===== TRABALHO PRÉ-CÁLCULO======");
		System.out.println("1 - Primeiro Grau - Usando uma equação"); // PrimeiroGrau.java
		System.out.println("2 - Primeiro Grau - Usando duas equações"); // EquacaoPrimeiroGrau2.java
		System.out.println("3 - Segundo Grau"); // Segundo Grau.java
		System.out.println("4 - Interseccao com primeiro e segundo grau"); // EquacaoSegundoGrau2.java
		System.out.println("5 - Exit");
		System.out.println(">> ");
		
		try {
			opcao = scan.nextInt();
			
			
		}catch(InputMismatchException e) {
			System.out.println("Digite somente numeros");
			System.exit(0);
		
		}
			
		switch(opcao) {	
		case 1:
			PrimeiroGrau.PrimeiroG(); main(null);break;
		case 2:
			EquacaoPrimeiroGrau2.PrimeiroGDois(); main(null);break;
		case 3:
			SegundoGrau.SegundoGrauUm(); main(null);break;
		case 4:
			EquacaoSegundoGrau2.InterseccaoPrimeiroSegundo(); main(null); break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Valor inválido! Digite outro valor");main(null);

		}


	
		
	}

	
}
