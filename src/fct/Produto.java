package fct;

public abstract class Produto {
	private String codigo;
	private String descricao;
	private float valor;
	
	public abstract float calcularPreco();
	
	public void setCodigo(String cod) {
		if(!cod.isEmpty())
			this.codigo = cod;
		else
			throw new IllegalArgumentException("O código não pode ser nulo.");
	}
	
	public void setDescricao(String desc) {
		if(!desc.isEmpty())
			this.descricao = desc;
		else
			throw new IllegalArgumentException("A descrição do produto não pode ser nula.");
	}
	
	public void setValor(float valor) {
		if(valor >= 0)
			this.valor = valor;
		else
			throw new IllegalArgumentException("O valor não pode ser negativo.");
	}
	
	public String getCodigo() {
		return this.codigo;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public float getValor() {
		return this.valor;
	}
}
