import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int feijoesNoJarro = 0;
		
		System.out.println("Você tem a chance de passar uma noite no castelo da princesa Javarella!! Basta acertar o número de feijões no jarro.");
		
		do {
			System.out.println("Quantos feijoes tem no Jarro? ");
			feijoesNoJarro = leitor.nextInt();
		}while (feijoesNoJarro != 1238);
		System.out.println("ACERTOU! Bem vindo ao Javarella rsrs");

		
		leitor.close();
	}
	
}