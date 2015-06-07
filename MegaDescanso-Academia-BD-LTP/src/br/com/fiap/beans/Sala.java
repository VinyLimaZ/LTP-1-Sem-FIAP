package br.com.fiap.beans;

public class Sala {

	private int num;

	private byte andar;

	private int seq;

	private byte lotacao;

	private String obs;

	public Sala(int num, byte andar, int seq, byte lotacao, String obs) {
		super();
		this.num = num;
		this.andar = andar;
		this.seq = seq;
		this.lotacao = lotacao;
		this.obs = obs;
	}

	public Sala() {
		super();
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public byte getAndar() {
		return andar;
	}

	public void setAndar(byte andar) {
		this.andar = andar;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public byte getLotacao() {
		return lotacao;
	}

	public void setLotacao(byte lotacao) {
		this.lotacao = lotacao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
