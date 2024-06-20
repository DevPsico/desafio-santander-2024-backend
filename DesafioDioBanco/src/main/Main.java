package main;

import model.Banco;
import model.Cliente;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Ericson ");
		
		Banco banco = new Banco();

		ContaCorrente cc = new ContaCorrente(cliente);
		ContaPoupanca cp = new ContaPoupanca(cliente);
		
		cc.depositar(100);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		cc.transferir(100, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();

		banco.adicionarConta(cc);
		banco.adicionarConta(cp);
		
		System.out.println(banco);
		banco.listarBanco();
		
	
	}
}