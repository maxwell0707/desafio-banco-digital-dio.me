package entidades;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	private int codBanco;
	List<Conta> listContas = new ArrayList<>();

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

	public void addConta(Conta conta) {
		listContas.add(conta);
	}

	public void removeConta(Conta conta) {
		listContas.remove(conta);
	}

	public void ListaContas() {
		for (Conta c : listContas) {
			System.out.println(c.extrato());
		}
	}

	public int quantidadeDeContas() {
		return listContas.size();
	}

	public double valorTotalContas() {
		double soma = 0;
		for(Conta c : listContas) {
			soma+=c.getSaldo();
		}return soma;
	}

}
