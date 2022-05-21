package entidades;

public class ContaCorrente extends Conta {

	public ContaCorrente(Clientes cliente,double saldo) {
		super(cliente, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Saque(double valor) {
		this.saque(valor);
		
	}

	@Override
	public void deposito(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void transferencia(Conta contaDestino, double valor) {
		this.saque(valor);
		contaDestino.deposito(valor);
		
	}

}
