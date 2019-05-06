package fct;

import java.util.Calendar;

public class Venda {
	private String numero;
	private Item[]itens;
	private TipoPagamento tipoPgto;
	private Cliente cliente;
	private Calendar data;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Item[] getItens() {
		return itens;
	}
	public void setItens(Item[] itens) {
		this.itens = itens;
	}
	public TipoPagamento getTipoPgto() {
		return tipoPgto;
	}
	public void setTipoPgto(TipoPagamento tipoPgto) {
		this.tipoPgto = tipoPgto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
}
