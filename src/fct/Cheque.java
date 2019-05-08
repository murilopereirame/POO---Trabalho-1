package fct;

import javax.swing.JOptionPane;

public class Cheque extends TipoPagamento{	
	private String nomeEmissor;
	private String numeroCheque;
	
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, 
				"Tipo de pagamento: " + this.getTipoPagamento() + "\nNome do emissor: " + this.getNomeEmissor() + "\nNúmero do cheque: " + this.getNumeroCheque(), 
				"Atenção", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getNomeEmissor() {
		return nomeEmissor;
	}

	public void setNomeEmissor(String nomeEmissor) {
		if(!nomeEmissor.isEmpty())
			this.nomeEmissor = nomeEmissor;
		else
			throw new IllegalArgumentException("O nome do emissor não pode ser nulo.");
	}

	public String getNumeroCheque() {
		return numeroCheque;
	}

	public void setNumeroCheque(String numeroCheque) {
		if(!numeroCheque.isEmpty())
			this.numeroCheque = numeroCheque;
		else
			throw new IllegalArgumentException("O número do cheque não pode ser nulo.");
	}
	
	
}
