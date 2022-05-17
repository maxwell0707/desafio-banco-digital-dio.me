package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Clientes cliente, int numeroConta, int agencia, double saldo) {
		super(cliente, numeroConta, agencia, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Saque(double valor) {
		saque(valor);
		
	}

	@Override
	public void deposito(double valor) {
		this.deposito(valor);
		
	}

	@Override
	public void transferencia(Conta contaDestino, double valor) {
		this.saque(valor);
		contaDestino.deposito(valor);
		
	}

}
