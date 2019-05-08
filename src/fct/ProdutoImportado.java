package fct;

public class ProdutoImportado extends Produto {
	private float taxaImposto;
	private float taxaImportacao;
	
	public void setTaxaImposto(float taxa) {
		if(taxa >= 0)
			this.taxaImposto = taxa;
		else
			throw new IllegalArgumentException("A taxa de imposto não pode ser negativa.");
	}
	
	public void setTaxaImportacao(float taxa) {
		if(taxa >= 0)
			this.taxaImportacao = taxa;
		else
			throw new IllegalArgumentException("A taxa de importação não pode ser negativa.");
	}
	
	private float getTaxaImportacao() {
		return this.taxaImportacao;
	}
	
	private float getTaxaImposto() {
		return this.taxaImposto;
	}
	
	public float calcularPreco() {
		return this.getTaxaImportacao() + this.getTaxaImposto() + this.getValor();
	}
}
