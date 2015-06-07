package br.com.fiap.beans;

public class ProfMod {

	private String dtAptidao;

	private PessoaFisAcad prof;

	private Modalidade mod;

	public ProfMod() {
		super();
	}

	public ProfMod(String dtAptidao, PessoaFisAcad prof, Modalidade mod) {
		super();
		this.dtAptidao = dtAptidao;
		this.prof = prof;
		this.mod = mod;
	}

	public String getDtAptidao() {
		return dtAptidao;
	}

	public void setDtAptidao(String dtAptidao) {
		this.dtAptidao = dtAptidao;
	}

	public PessoaFisAcad getProf() {
		return prof;
	}

	public void setProf(PessoaFisAcad prof) {
		this.prof = prof;
	}

	public Modalidade getMod() {
		return mod;
	}

	public void setMod(Modalidade mod) {
		this.mod = mod;
	}

}
