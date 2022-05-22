package entidades;

public abstract class Conta implements Iconta{
	
	private static final int AGENCIA = 4400;
	private static  int NUMEROCONTA = 0;
	protected Clientes Cliente;
	protected int numeroConta;
	protected int agencia;
	protected double saldo;
	
	public Conta(Clientes cliente, double saldo) {
		
		Cliente = cliente;
		this.numeroConta = NUMEROCONTA++;
		this.agencia = AGENCIA;
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
	public String extrato(){
		return "cliente: "
		+Cliente.getNome()
		+"\nAgencia: "
		+ getAgencia()
		+" /Conta: "
		+getNumeroConta()
		+"\nSaldo: R$ "
		+String.format("%.2f",getSaldo());
		
		
	}
	
}
