package application;

import entities.Conta;

public class Main {
	
	public static void main(String[] args) {
		Conta c1 = new Conta(1234, "Fulano de Tal", 1000.0);

		if(c1.sacar(500.0))
			System.out.println("Saque realizado com sucesso");
		else
			System.out.println("Saque não realizado: conta sem fundos!!!");
		c1.depositar(200.0);
		
		// System.out.println("Saldo da conta de " + c1.titular + ": R$ " + c1.saldo);
		System.out.println("Saldo da conta de " + c1.getTitular() + ": R$ " + c1.getSaldo());
		
	}

}