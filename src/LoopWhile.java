import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/

		Scanner leitor = new Scanner (System.in);
		int idade;
		int contador = 0;
		int qtde;
		double media = 0;
		System.out.println("Informe o numero de alunos: ");
		qtde = leitor.nextInt();
		while (contador < qtde) {
			System.out.println("Por favor, informe do " + (contador + 1) + "� aluno");
			idade = leitor.nextInt();
			contador = contador + 1;
			media = media + idade;
		}
		
		media = media / qtde;
		
		System.out.println("A media de idades dos alunos da escola � " + media + " anos");
		
		leitor.close();
	}

}