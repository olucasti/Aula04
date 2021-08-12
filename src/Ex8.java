import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		//Um professor quer saber quantos alunos de uma sala de 50 tiveram nota maior do que a média. Faça um programa onde o professor informe a média e as notas de cada um dos 50 alunos e, ao final, seja exibido quantos alunos tiveram nota superior à média e quantos tiveram nota inferior à média.
		
		Scanner leitor = new Scanner (System.in);
		double media, nota = 0.0;
		int qtde = 1, aprovados = 0, reprovados = 0;
		
		System.out.println("Qual a media da turma? ");
		media = leitor.nextDouble();
		
		while (qtde <= 50) {
			System.out.println("Informe a nota do º" + qtde + " aluno:");
			nota = leitor.nextDouble();
			if (nota >= media) {
				aprovados++;
			}else {
				reprovados++;
			}
			qtde++;
		}
		leitor.close();
		System.out.println("Nessa turma. alunos acima da média " + aprovados + " e alunos abaixo da média " + reprovados);
	}

}