package br.com.fiap.beans;

public class PessoaFis extends Pessoa {

	protected long cpf;

	protected long rg;

	public PessoaFis() {
		super();
	}

	public PessoaFis(String nome, Endereco endereco, String email, Telefone telefone, long cpf, long rg) {
		super(nome, endereco, email, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public long getRg() {
		return rg;
	}

	public void setRg(long rg) {
		this.rg = rg;
	}
	
	
	
}

