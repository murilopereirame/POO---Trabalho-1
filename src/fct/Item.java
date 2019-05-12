package fct;

public class Item {
	private int num;
	private String codigoProduto;
	private String descricao;
	private float Valor;
	private float quantidade;
	Produto produto;
	
	public Item(int num, Produto p) {
		this.setNum(num);
		this.setProduto(p);
		this.setDescricao(this.getProduto().getDescricao());
		this.setCodigoProduto(this.getProduto().getCodigo());
		this.setValor(this.getProduto().getValor());
	}

	public void setProduto(Produto p) {
		if(p != null)
			this.produto = p;
		else
			throw new IllegalArgumentException("O produto não pode ser nulo.");
	}
	
	private Produto getProduto() {
		return this.produto;
	}
	
	private void setCodigoProduto(String cod) {
		if(!cod.isEmpty())
			this.codigoProduto = cod;
		else
			throw new IllegalArgumentException("O código do produto não pode ser nulo.");
	}
	
	private void setDescricao(String desc) {
		if(!desc.isEmpty())
			this.descricao = desc;
		else
			throw new IllegalArgumentException("A descrição não pode ser nula.");
	}
	
	private void setValor(float valor) {
		if(valor >=0)
			this.Valor = valor;
		else
			throw new IllegalArgumentException("O valor não pode ser negativo.");
	}
	
	public void setQuantidade(float qnt) {
		if(qnt >= 0)
			this.quantidade = qnt;
		else
			throw new IllegalArgumentException("A quantidade não pode ser negativa.");
	}
	
	private void setNum(int num) {
		if(num >=0)
			this.num = num;
		else
			throw new IllegalArgumentException("O número não pode ser nulo.");
	}		

	public int getNum() {
		return num;
	}

	public String getCodigoProduto() {
		return codigoProduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public float getValor() {
		return Valor;
	}

	public float getQuantidade() {
		return quantidade;
	}	
	
	public float calcularTotal() {
		return this.getQuantidade() * this.getValor();
	}
	
}