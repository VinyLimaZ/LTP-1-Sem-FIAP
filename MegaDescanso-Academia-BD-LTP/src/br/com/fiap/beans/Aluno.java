package br.com.fiap.beans;


public class Aluno extends PessoaFisAcad {

	protected String dtMatric;

	protected PessoaJur inst;

	public Aluno() {
		super();
	}

	public Aluno(String nome, Endereco endereco, String email,
			Telefone telefone, long cpf, long rg, String dtNasc, int codMatric,
			char sexo, String dtMatric, PessoaJur inst) {
		super(nome, endereco, email, telefone, cpf, rg, dtNasc, codMatric, sexo);
		this.dtMatric = dtMatric;
		this.inst = inst;
	}

	public String getDtMatric() {
		return dtMatric;
	}

	public void setDtMatric(String dtMatric) {
		this.dtMatric = dtMatric;
	}

	public PessoaJur getInst() {
		return inst;
	}

	public void setInst(PessoaJur inst) {
		this.inst = inst;
	}

}
