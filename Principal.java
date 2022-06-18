package contaBancariaOO;
import javax.swing.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica clienteFisico = new PessoaFisica();
		PessoaJuridica clienteJuridico = new PessoaJuridica();
		ContaPoupanca contaPoupanca = new ContaPoupanca("1209", "1101", clienteFisico, "1878", 15);
		ContaEspecial contaEspecial = new ContaEspecial("1210", "5522", clienteJuridico, "1878", 2000);
		
	}
	
	public static void criaConta(Pessoa cliente) {
		System.out.println("Digite o nome do cliente.");
		JOptionPane.showInputDialog("Digite o nome do cliente");
	}
}
