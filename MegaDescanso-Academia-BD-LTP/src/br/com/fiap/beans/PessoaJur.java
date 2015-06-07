package br.com.fiap.beans;

public class PessoaJur extends Pessoa {

	protected int cod;

	protected String razaoSocial;

	protected long cnpj;

	protected int filial;

	protected byte digVerif;

	protected String site;

	protected Telefone telefone;

	protected String contato;

	protected int qtdFunc;

	protected double valorDesc;
	
	public PessoaJur(){
		super();
	}

	public PessoaJur(String nome, Endereco endereco, String email,
			Telefone telefone, int cod, String razaoSocial, long cnpj,
			int filial, byte digVerif, String site, Telefone telefone2,
			String contato, int qtdFunc, double valorDesc) {
		super(nome, endereco, email, telefone);
		this.cod = cod;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.filial = filial;
		this.digVerif = digVerif;
		this.site = site;
		telefone = telefone2;
		this.contato = contato;
		this.qtdFunc = qtdFunc;
		this.valorDesc = valorDesc;
	}
	
}
