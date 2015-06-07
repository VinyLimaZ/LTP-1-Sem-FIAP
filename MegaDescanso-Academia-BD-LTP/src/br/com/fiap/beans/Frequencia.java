package br.com.fiap.beans;

public class Frequencia {

	private String dtAula;

	private Modalidade mod;

	private Aula aula;

	private int seqAula;

	private ProfMod prof;

	public Frequencia(String dtAula, Modalidade mod, Aula aula, int seqAula,
			ProfMod prof) {
		super();
		this.dtAula = dtAula;
		this.mod = mod;
		this.aula = aula;
		this.seqAula = seqAula;
		this.prof = prof;
	}

	public Frequencia() {
		super();
	}

	public String getDtAula() {
		return dtAula;
	}

	public void setDtAula(String dtAula) {
		this.dtAula = dtAula;
	}

	public Modalidade getMod() {
		return mod;
	}

	public void setMod(Modalidade mod) {
		this.mod = mod;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public int getSeqAula() {
		return seqAula;
	}

	public void setSeqAula(int seqAula) {
		this.seqAula = seqAula;
	}

	public ProfMod getProf() {
		return prof;
	}

	public void setProf(ProfMod prof) {
		this.prof = prof;
	}

}
