package br.com.fiap.beans;


public class Modalidade {

	private byte cod;

	private String desc;

	private String dtInicio;

	private String dtTerm;

	public Modalidade() {
		super();
	}

	public Modalidade(byte cod, String desc, String dtInicio, String dtTerm) {
		super();
		this.cod = cod;
		this.desc = desc;
		this.dtInicio = dtInicio;
		this.dtTerm = dtTerm;
	}

	public byte getCod() {
		return cod;
	}

	public void setCod(byte cod) {
		this.cod = cod;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtTerm() {
		return dtTerm;
	}

	public void setDtTerm(String dtTerm) {
		this.dtTerm = dtTerm;
	}

}
