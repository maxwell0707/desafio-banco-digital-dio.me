package entidades;

public abstract class Conta implements Iconta{
	
	protected Clientes Cliente;
	protected int numeroConta;
	protected int agencia;
	protected double saldo;
	
	public Conta(Clientes cliente, int numeroConta, int agencia, double saldo) {
		
		Cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public Clientes getCliente() {
		return Cliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saque( double valor) {
		this.saldo -= valor;
	}

	public void deposito( double valor) {
		this.saldo += valor;
	}
	public void transferencia(double valor, Conta contaDistino) {
	
		
	}
	public String toString(){
		return "cliente: "
		+Cliente.getNome()
		+"\nAgencia: "
		+ getAgencia()
		+"\nConta: "
		+getNumeroConta()
		+"\nSaldo: R$ "
		+String.format("%.2f",getSaldo());
		
		
	}
	
}
