package descomplica;

import javax.swing.JOptionPane;

public class exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaracao de variaveis
		int n1, n2, div;
		double pot;
		String msg = "";
		
		// entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		// processamento
		div = (int)n1 / (int)n2;
		pot = Math.pow(n1, n2);
		
		
		// saida de resultados
		msg = msg + "O quociente da divisão dos dos números é " + div + "\n";
		msg = msg + "A potência do primeiro e segundo número é " + pot + "\n";
		
		JOptionPane.showMessageDialog(null, msg);
		System.exit(0);

	}

}
