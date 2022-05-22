package entidades;

public class Poupanca extends Conta{

	public Poupanca(Clientes cliente, double saldo) {
		super(cliente, saldo);
		
	}

	@Override
	public void Saque(double valor) {
		// saque de conta poupanca não tem tarifa.
		this.saldo -= valor;
		
	}

	@Override
	public void transferencia(Conta contaDestino, double valor) {
		this.Saque(valor);
		contaDestino.deposito(valor);
		
	}

}
