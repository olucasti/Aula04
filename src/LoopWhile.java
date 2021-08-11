import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
		 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?*/

		Scanner leitor = new Scanner (System.in);
		int idade;
		int contador = 0;
		int qtde;
		double media = 0;
		System.out.println("Informe o numero de alunos: ");
		qtde = leitor.nextInt();
		while (contador < qtde) {
			System.out.println("Por favor, informe do " + (contador + 1) + "º aluno");
			idade = leitor.nextInt();
			contador = contador + 1;
			media = media + idade;
		}
		
		media = media / qtde;
		
		System.out.println("A media de idades dos alunos da escola é " + media + " anos");
		
		leitor.close();
	}

}