package entidades;

public interface Iconta {
	
	void Saque(double valor);
	void deposito(double valor);
	void transferencia(Conta contaDestino,double valor);

}
