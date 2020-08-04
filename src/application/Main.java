package application;

class Conta {
	int numero;
	String titular;
	double saldo;
	
	void sacar(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	void depositar(double quantidade) {
		this.saldo += quantidade;
	}
}

public class Main {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.titular = "Fulano de Tal";
		c1.saldo = 1000.0;
		c1.sacar(500.0);
		c1.depositar(200.0);
		
		System.out.println("Saldo da conta de " + c1.titular + ": R$ " + c1.saldo);
	}

}
