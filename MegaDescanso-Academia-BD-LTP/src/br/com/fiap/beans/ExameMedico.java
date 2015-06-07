package br.com.fiap.beans;

public class ExameMedico {

	private int cod;

	private Aluno aluno;

	private Medico medico;

	private String dtAval;

	private float vlrPress;

	private int qtdBatim;

	private float alt;

	private float peso;

	private String obs;

	public ExameMedico(int cod, Aluno aluno, Medico medico, String dtAval,
			float vlrPress, int qtdBatim, float alt, float peso, String obs) {
		super();
		this.cod = cod;
		this.aluno = aluno;
		this.medico = medico;
		this.dtAval = dtAval;
		this.vlrPress = vlrPress;
		this.qtdBatim = qtdBatim;
		this.alt = alt;
		this.peso = peso;
		this.obs = obs;
	}

	public ExameMedico() {
		super();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getDtAval() {
		return dtAval;
	}

	public void setDtAval(String dtAval) {
		this.dtAval = dtAval;
	}

	public float getVlrPress() {
		return vlrPress;
	}

	public void setVlrPress(float vlrPress) {
		this.vlrPress = vlrPress;
	}

	public int getQtdBatim() {
		return qtdBatim;
	}

	public void setQtdBatim(int qtdBatim) {
		this.qtdBatim = qtdBatim;
	}

	public float getAlt() {
		return alt;
	}

	public void setAlt(float alt) {
		this.alt = alt;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
