package entities;

public class Cliente {
	private String nome;
	private String email;
	private String cpf;
	private static int totalDeClientes;
	public Cliente(String nome, String email, String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		Cliente.totalDeClientes += 1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public static int getTotalDeClientes() {
		return Cliente.totalDeClientes;
	}
}
