package application;

import entities.Cliente;
import entities.Conta;

public class Main {
	
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Fulano de Tal", "fulano@email.com", "123.456.789-00");
		Conta c1 = new Conta(1234, cli1, 1000.0);

		Cliente cli2 = new Cliente("Beltrano de Tal", "beltrano@email.com", "111.222.333-44");
		Conta c2 = new Conta(4567, cli2, 5000.0);
		
		if(c1.transferirPara(c2, 300.00))
			System.out.println("Transferência realizada com sucesso");

		System.out.println("Saldo da conta de " + c1.getTitular().getNome() + ": R$ " + c1.getSaldo());	
		System.out.println("Saldo da conta de " + c2.getTitular().getNome() + ": R$ " + c2.getSaldo());	
		System.out.println("Número total de clientes: " + Cliente.getTotalDeClientes());
	}
}
