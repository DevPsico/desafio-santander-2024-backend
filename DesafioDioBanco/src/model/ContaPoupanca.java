package model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		System.out.println("   EXTRATO CONTA POUPAN�A  ");
		super.imprimirExtratoComum();
	}


}