package application;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Cliente bjorn = new Cliente();
		bjorn.setNome("Bjorn");
		
		Conta cc = new ContaCorrente(bjorn);
		Conta poupanca = new ContaPoupanca(bjorn);
		
		cc.depositar(100);
		cc.transferir(80, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
