package br.com.fiap.beans;

public class Medico extends PessoaFis{

	protected int crm;

	protected int cod;

	public Medico(String nome, Endereco endereco, String email,
			Telefone telefone, long cpf, long rg, int crm, int cod) {
		super(nome, endereco, email, telefone, cpf, rg);
		this.crm = crm;
		this.cod = cod;
	}

	public Medico() {
		super();
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

}
