package entidades;

public class Banco {
	private String nome;
	private int codBanco;

	public Banco(String nome, int codBanco) {

		this.nome = nome;
		this.codBanco = codBanco;
	}

	public String getNome() {
		return nome;
	}

	public int getCodBanco() {
		return codBanco;
	}
	

}
