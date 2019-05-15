package fct;

import java.io.Serializable;

public class ProdutoNacional extends Produto{
	private float taxaImposto;
	
	public void setTaxaImposto(float taxa) {
		if(taxa >= 0)
			this.taxaImposto = taxa;
		else
			throw new IllegalArgumentException("A taxa de imposto não pode ser negativa.");
	}
	
	public float getTaxaImposto() {
		return this.taxaImposto;
	}
	
        @Override
	public float calcularPreco() {
		return this.getValor() + this.getTaxaImposto();
	}
}
