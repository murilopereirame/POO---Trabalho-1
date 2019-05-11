package fct;

public class Cliente {
	private String cpf;
	private String nome;
	
	public void setCpf(String CPF) {
		if(!CPF.isEmpty())
			this.cpf = CPF;
		else
			throw new IllegalArgumentException("O CPF não pode ser nulo.");
	}
	
	public void setNome(String nome) {
		if(!nome.isEmpty())
			this.nome = nome;
		else
			throw new IllegalArgumentException("O nome não pode ser nulo.");
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf(){
		return this.cpf;
	}
}
