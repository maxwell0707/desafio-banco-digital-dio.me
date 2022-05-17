package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Clientes {

	private String nome;
	private String cpf;
	private  Date dataNascimento;
	public Clientes(String nome, String cpf, Date dataNascimento) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	
	
}
