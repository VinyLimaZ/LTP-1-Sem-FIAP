package br.com.fiap.beans;

public class Aula {

	private int seq;

	private Modalidade mod;

	private Sala sala;

	private String dif;

	private String hrInicio;

	private String tmpDurac;

	public Aula(int seq, Modalidade mod, Sala sala, String dif,
			String hrInicio, String tmpDurac) {
		super();
		this.seq = seq;
		this.mod = mod;
		this.sala = sala;
		this.dif = dif;
		this.hrInicio = hrInicio;
		this.tmpDurac = tmpDurac;
	}

	public Aula() {
		super();
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Modalidade getMod() {
		return mod;
	}

	public void setMod(Modalidade mod) {
		this.mod = mod;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getDif() {
		return dif;
	}

	public void setDif(String dif) {
		this.dif = dif;
	}

	public String getHrInicio() {
		return hrInicio;
	}

	public void setHrInicio(String hrInicio) {
		this.hrInicio = hrInicio;
	}

	public String getTmpDurac() {
		return tmpDurac;
	}

	public void setTmpDurac(String tmpDurac) {
		this.tmpDurac = tmpDurac;
	}

}
