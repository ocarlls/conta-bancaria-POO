package contaBancariaOO;

public abstract class ContaBancaria {
	private String numConta;
	private String senha;
	private Pessoa cliente;
	private String agencia;
	
	public ContaBancaria(String numConta, String senha, Pessoa cliente, String agencia) {
		this.numConta = numConta;
		this.senha = senha;
		this.cliente = cliente;
		this.agencia = agencia;
	}

	private double saldo;
	
	
	public void sacar(double valorSaque, String numConta, String senha) {
		if (valorSaque > saldo) {
			System.out.println("Não é possível realizar saque maior que o seu saldo!");
		}	else if(this.senha == senha){
			this.saldo -= valorSaque;
		}
	}
	
	public void depositar(double valorDeposito, String numConta) {
		this.saldo += valorDeposito;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public Pessoa getCliente() {
		return cliente;
	}

	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
}
