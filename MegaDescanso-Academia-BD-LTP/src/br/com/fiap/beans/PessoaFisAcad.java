package br.com.fiap.beans;

public class PessoaFisAcad extends PessoaFis {

	protected String dtNasc;

	protected int codMatric;

	protected char sexo;

	public PessoaFisAcad() {
		super();
	}
	public PessoaFisAcad(String nome, Endereco endereco, String email,
			Telefone telefone, long cpf, long rg, String dtNasc,
			int codMatric, char sexo) {
		super(nome, endereco, email, telefone, cpf, rg);
		this.dtNasc = dtNasc;
		this.codMatric = codMatric;
		this.sexo = sexo;
	}
	public String getDtNasc() {
		return dtNasc;
	}
	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public int getCodMatric() {
		return codMatric;
	}
	public void setCodMatric(int codMatric) {
		this.codMatric = codMatric;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	

}
