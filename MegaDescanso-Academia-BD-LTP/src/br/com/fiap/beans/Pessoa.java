package br.com.fiap.beans;

public class Pessoa {

	protected String nome;

	protected Endereco endereco;

	protected String email;

	protected Telefone telefone;

	public Pessoa(){
		super();
	}
	public Pessoa(String nome, Endereco endereco, String email, Telefone telefone){
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
}

