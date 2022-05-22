package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Banco;
import entidades.Clientes;
import entidades.Conta;
import entidades.ContaCorrente;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("DD/mm/yyyy");

		Clientes clientes1 = new Clientes("maxwell pereira", "04710090165", sdf.parse("27/07/1992"));
		Clientes clientes2 = new Clientes("joao Batista", "0454152354254", sdf.parse("07/07/1992"));
		Clientes clientes3 = new Clientes("Ana carolina", "04418186174", sdf.parse("10/10/1992"));
		Clientes clientes4 = new Clientes("davi lucca soares", "00000022455", sdf.parse("12/12/1992"));
		Conta a, b,c,d;
		a = new ContaCorrente(clientes1, 1000.0);
		b = new ContaCorrente(clientes2, 50000.0);
		c = new ContaCorrente(clientes3, 15000.0);
		d = new ContaCorrente(clientes4, 5000.0);
		Banco santander = new Banco("santander",033);
		santander.addConta(a);
		santander.addConta(b);
		santander.addConta(c);
		santander.addConta(d);
		/*a.transferencia(b, 1000.0);
		b.transferencia(a, 50000.0);
		a.saque(25000.0);
		
		*/
		System.out.println("quantidade de contas:" +santander.quantidadeDeContas());
		santander.ListaContas();

	}

}
