import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex07 {

	public static boolean somenteTextos(String text) {
	    return text.matches("[^\\d]+"); //matches no regex
	    //Se tiver n�mero na string ir� retornar falso
	    // \\  uma sendo obrigat�ria para servir de caractere de escape
	}

	
	
	public static void main(String[] args) {
	
		Scanner leitor = new Scanner (System.in);
		int feijoesNoJarro = 0;
		String entrada ;
	    JOptionPane.showMessageDialog(null, "Voc� tem a chance de passar uma noite no castelo da princesa Javarella!! Basta acertar o n�mero de feij�es no jarro.","Aten��o..Novidade, basta acertar a pr�xima pergunta", JOptionPane.QUESTION_MESSAGE);
		
		do {
			entrada = JOptionPane.showInputDialog("Quantos feijoes tem no Jarro? ");	
		    if (entrada == null) {
		    	 entrada = "";
		    } else if (entrada.equals("")  | (somenteTextos(entrada))) {
			    JOptionPane.showMessageDialog(null, "S�o permitidos somente n�meros");
			} else {
				 feijoesNoJarro = Integer.parseInt(entrada);
			}
			
		}while (feijoesNoJarro != 1238);
		  JOptionPane.showMessageDialog(null, "ACERTOU! Bem vindo ao Javarella rsrs","Acertou", JOptionPane.INFORMATION_MESSAGE);
				
		leitor.close();
	}
	
}