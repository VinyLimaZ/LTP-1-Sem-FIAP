package br.com.fiap.beans;

public class Telefone {

	private byte codPais;

	private int tel;

	private byte ddd;

	public Telefone(byte codPais, int tel, byte ddd) {
		super();
		this.codPais = codPais;
		this.tel = tel;
		this.ddd = ddd;
	}

	public Telefone() {
		super();
	}

	public byte getCodPais() {
		return codPais;
	}

	public void setCodPais(byte codPais) {
		this.codPais = codPais;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public byte getDdd() {
		return ddd;
	}

	public void setDdd(byte ddd) {
		this.ddd = ddd;
	}

}
