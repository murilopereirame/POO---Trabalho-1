package fct;

import java.util.Calendar;

public class Main {
	
	public static void main(String args[]) {
		
		/*
		 * Teste Venda
		 */
		Calendar cd = Calendar.getInstance();		
		ProdutoNacional p = new ProdutoNacional();
		p.setCodigo("AB-1");
		p.setDescricao("Carreta");
		p.setValor(250.0f);
		p.setTaxaImposto(10f);
		Item it = new Item(1, p);
		it.setQuantidade(5);
		
		Cliente c = new Cliente();
		c.setCpf("46704685880");
		c.setNome("Murilo Pereira");
		
		Dinheiro dn = new Dinheiro();
		dn.setTipoPagamento("Dinheiro");		
		
		Venda v1 = new Venda(1);
		v1.setCliente(c);
		v1.setData(cd);
		v1.setNumero("VD-1");
		v1.setTipoPgto(dn);
		v1.addItem(it);
		
		System.out.println("Cliente: " + v1.getCliente().getNome());
		System.out.println("\nProdutos:");
		System.out.println(v1.getItens()[0].getNum() + " | " + v1.getItens()[0].getDescricao());
		System.out.println("\nData: " + v1.getData().get(Calendar.DATE));
		v1.getTipoPgto().exibirDados();
		
	}
}
