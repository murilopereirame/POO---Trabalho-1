package fct;

public class Main {
	
	public static void main(String args[]) {
		
		/*
		 * Teste dinheiro -> Exibir
		 */
		Cartao dr = new Cartao();
		dr.setTipoPagamento("Cartão");
		dr.setNome("Murilo Pereira");
		dr.setNumero("12345689");
		dr.exibirDados();
	}
}
