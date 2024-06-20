package model;

public abstract class Conta implements IConta {

	// PRIVATE quem HERDA n PD MEXER
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	// PROTECTED quem HERDA pd MEXER
	protected int agencia;
	protected int numeroConta;
	protected double saldo = 0;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numeroConta = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		saldo += valor;

	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	protected void imprimirExtratoComum() {
		System.out.println("Agência: " + agencia);
		System.out.println(String.format("Conta: %d", numeroConta));
		System.out.println(String.format("Saldo: %.2f", saldo));
		System.out.println(String.format("Titular: %s ", this.cliente.getNome()));

	}

	@Override
	public String toString() {
		return String.format("Conta{agencia=%d, numeroConta=%d, saldo=%.2f, cliente=%s}", agencia, numeroConta, saldo,
				cliente);
	}
}