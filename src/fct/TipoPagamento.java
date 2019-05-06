package fct;

public abstract class TipoPagamento {
	private String tipoPagamento;
	
	public void setTipoPagamento(String tip) {
		if(!tip.isEmpty())
			this.tipoPagamento = tip;
		else
			throw new IllegalArgumentException("O tipo não pode ser vazio.");
	}
	
	public String getTipoPagamento() {
		return this.tipoPagamento;
	}
	
	public abstract void exibirDados();
}
