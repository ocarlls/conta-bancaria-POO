package contaBancariaOO;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;
	
	public ContaPoupanca(String numConta, String senha, PessoaFisica cliente, String agencia, int diaRendimento) {
		super(numConta, senha, cliente, agencia);
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(float taxaRendimento) {
		
	}

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
}
