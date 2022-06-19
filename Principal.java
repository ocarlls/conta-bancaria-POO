package contaBancariaOO;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica clienteFisico = new PessoaFisica();
		PessoaJuridica clienteJuridico = new PessoaJuridica();
		ContaPoupanca contaPoupanca = new ContaPoupanca("1209", "1101", clienteFisico, "1878", 15);
		ContaEspecial contaEspecial = new ContaEspecial("1210", "5522", clienteJuridico, "1878", 2000);
		
		criaConta(clienteFisico);
	}
	
	public static void criaConta(Pessoa cliente) {
		cliente.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
		cliente.setTelefone(JOptionPane.showInputDialog("Digite o telefone do cliente"));
		cliente.setEndereço(JOptionPane.showInputDialog("Digite o endereço do cliente"));
		if (cliente instanceof PessoaFisica) {
			((PessoaFisica) cliente).setCpf(JOptionPane.showInputDialog("Digite o cpf do cliente"));
		} else {
			((PessoaJuridica) cliente).setCnpj(JOptionPane.showInputDialog("Digite o cnpj do cliente"));
		}
	}
}
