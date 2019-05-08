package fct;

import javax.swing.JOptionPane;

public class Dinheiro extends TipoPagamento{
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Tipo de pagamento: " + this.getTipoPagamento(), "Atenção", JOptionPane.INFORMATION_MESSAGE); 
	}
}
