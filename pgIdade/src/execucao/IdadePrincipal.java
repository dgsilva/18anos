package execucao;
// Usando if se a idade dele for menor que 18 anos
import javax.swing.JOptionPane;

public class IdadePrincipal {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
		if(idade <18){
			System.out.println("É menor!:" + idade);
		} else {
			System.out.println("É maior que 18 anos:" + idade);
		}
		
	}

}
