package br.com.fiap.beans;

public class Professor extends PessoaFisAcad {

	protected String apelido;

	protected int codigo;

	public Professor(String nome, Endereco endereco, String email,
			Telefone telefone, long cpf, long rg, String dtNasc, int codMatric,
			char sexo, String apelido, int codigo) {
		super(nome, endereco, email, telefone, cpf, rg, dtNasc, codMatric, sexo);
		this.apelido = apelido;
		this.codigo = codigo;
	}

	public Professor() {
		super();
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
