package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entidades.Clientes;
import entidades.Conta;
import entidades.ContaCorrente;

public class Main {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("DD/mm/yyyy");

		Clientes clientes1 = new Clientes("maxwell pereira", "04710090165", sdf.parse("07/07/1992"));
		Clientes clientes2 = new Clientes("joao Batista", "04418186174", sdf.parse("07/07/1992"));
		Conta a, b;
		a = new ContaCorrente(clientes1, 2222, 1050, 10.0);
		b = new ContaCorrente(clientes2, 2223, 1055, 500.0);
		System.out.println(a.toString());
		System.out.println("********************************************************");
		System.out.println(b.toString());
		a.deposito(100.0);
		System.out.println(a.toString());
		System.out.println("********************************************************");
		System.out.println(b.toString());

	}

}
