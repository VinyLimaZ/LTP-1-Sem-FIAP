package br.com.fiap.beans;

public class Endereco {

	private String log;

	private String end;

	private int num;

	private int cep;

	private String bairro;

	private String cidade;

	private byte uf;

	public Endereco(String log, String end, int num, int cep, String bairro,
			String cidade, byte uf) {
		super();
		this.log = log;
		this.end = end;
		this.num = num;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Endereco() {
		super();
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public byte getUf() {
		return uf;
	}

	public void setUf(byte uf) {
		this.uf = uf;
	}

}
