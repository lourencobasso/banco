package entities;

public class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;
	
	public Conta(int numero, Cliente titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public boolean sacar(double quantidade) {
		if(this.saldo < quantidade)
			return	false;
		else {
			this.saldo -= quantidade;
			return true;
		}
	}
	
	public void depositar(double quantidade) {
		this.saldo += quantidade;
	}

	public boolean transferirPara(Conta destino, double valor) {
		boolean retirou = this.sacar(valor);
		if (retirou == false) {
			// não deu pra sacar!
			return false;
		}
		else {
			destino.depositar(valor);
			return true;
		}
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
