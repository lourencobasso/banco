package application;

class Conta {
	int numero;
	String titular;
	double saldo;
}

public class Main {
	
	public static void main(String[] args) {
		Conta c1 = new Conta();
		
		c1.titular = "Fulano de Tal";
		c1.saldo = 1000.0;
		
		System.out.println("Saldo da conta de " + c1.titular + ": R$ " + c1.saldo);
	}

}
