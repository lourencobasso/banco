package application;

class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean sacar(double quantidade) {
		if(this.saldo < quantidade)
			return	false;
		else {
			this.saldo -= quantidade;
			return true;
		}
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
		if(c1.sacar(500.0))
			System.out.println("Saque realizado com sucesso");
		else
			System.out.println("Saque não realizado: conta sem fundos!!!");
		c1.depositar(200.0);
		
		System.out.println("Saldo da conta de " + c1.titular + ": R$ " + c1.saldo);
	}

}
