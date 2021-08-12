import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		int feijoesNoJarro = 0;
				String entrada ;
	    JOptionPane.showMessageDialog(null, "Você tem a chance de passar uma noite no castelo da princesa Javarella!! Basta acertar o número de feijões no jarro.","Atenção..Novidade, basta acertar a próxima pergunta", JOptionPane.QUESTION_MESSAGE);
		
		do {
			entrada = JOptionPane.showInputDialog("Quantos feijoes tem no Jarro? ");
			feijoesNoJarro = Integer.parseInt(entrada);
		}while (feijoesNoJarro != 1238);
		  JOptionPane.showMessageDialog(null, "ACERTOU! Bem vindo ao Javarella rsrs","Acertou", JOptionPane.INFORMATION_MESSAGE);
				
		leitor.close();
	}
	
}