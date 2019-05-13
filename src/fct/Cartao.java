package fct;

import javax.swing.JOptionPane;

public class Cartao extends TipoPagamento{
	private String nome;
	private String numero;
	
        @Override
	public void exibirDados() {
		JOptionPane.showMessageDialog(null, 
				"Tipo de pagamento: " + this.getTipoPagamento() + "\nNome no cartão: " + this.getNome() + "\nNúmero do cartão: " + this.getNumero(), 
				"Compra Efetuada!", JOptionPane.INFORMATION_MESSAGE);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.isEmpty())
			this.nome = nome;
		else
			throw new IllegalArgumentException("O nome não pode ser nulo.");
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if(!numero.isEmpty())
			this.numero = numero;
		else
			throw new IllegalArgumentException("O número do cartão não pode ser nulo.");
	}
}
