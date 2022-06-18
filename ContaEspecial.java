package contaBancariaOO;

public class ContaEspecial extends ContaBancaria{
	private float limiteConta;

	public ContaEspecial(String numConta, String senha, PessoaJuridica cliente, String agencia, float limiteConta) {
		super(numConta, senha, cliente, agencia);
		this.limiteConta = limiteConta;
	}

	public float getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(float limiteConta) {
		this.limiteConta = limiteConta;
	}
}
