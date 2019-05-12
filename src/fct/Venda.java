package fct;

import java.util.Calendar;

public class Venda {
	private String numero;
	private Item[]itens;
	private TipoPagamento tipoPgto;
	private Cliente cliente;
	private Calendar data;
	
	public Venda(int maxItens) {
		itens = new Item[maxItens];
	}    
	public void addItem(Item item) {
		if(item != null) {;
			for(int i = 0; i < itens.length; i++) {
				if(itens[i] == null) {
					itens[i] = item;
				}
			}
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(!numero.isEmpty())
			this.numero = numero;
		else
			throw new IllegalArgumentException("O número não pode ser nulo.");
	}
	public Item[] getItens() {
		return itens;
	}
	public TipoPagamento getTipoPgto() {
		return tipoPgto;
	}
	public void setTipoPgto(TipoPagamento tipoPgto) {
		if(tipoPgto != null)
			this.tipoPgto = tipoPgto;
		else
			throw new IllegalArgumentException("O tipo de pagamento não pode ser nulo.");
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
                
                    
		if(cliente != null)
			this.cliente = cliente;
		else
			throw new IllegalArgumentException("O cliente não pode ser nulo.");
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		if(data != null)
			this.data = data;
		else
			throw new IllegalArgumentException("A data não pode ser nula.");
	}
}
