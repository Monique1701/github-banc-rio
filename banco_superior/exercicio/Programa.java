package banco_superior.exercicio;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		IConta conta1 = new ContaCorrente("Carol", "222", "AA", "CC", "24-12-2020");
		
		IConta conta2 = new ContaPoupanca("Alicia", "012", "AA", "CP", "24-12-2020");
		
		IConta conta3 = new ContaInvestimento("Fernanda", "123", "BB", "CI", "24-12-2020");
		
		IConta conta4 = new ContaSalario("Valentina", "555", "DA", "CS", "01-02-2021");
		
		Cliente cliente1 = new Cliente("José", "123456", "13/01/2020");
		
		
		
		
		cliente1.adicionarContaCliente(conta1);
		cliente1.adicionarContaCliente(conta2);
		cliente1.adicionarContaCliente(conta3);
	

	
		cliente1.adicionarTelefone("87-99178-7077");
		cliente1.adicionarTelefone("88-99171-3050");
		cliente1.adicionarTelefone("81-99124-1534");
		
		
		cliente1.removerTelefone("87-99624-8593");
		cliente1.removerTelefone("81-99124-1534");
		
		cliente1.adicionarContaCliente(conta3);
		cliente1.adicionarContaCliente(conta4);
		
		conta3.ativarConta();
		conta4.ativarConta();
		conta1.desativarConta();;
		
		conta3.depositar(800);
		conta2.depositar(25000);
		conta1.depositar(1000);
		conta4.depositar(6000);
		
		conta3.pagarMensalidade();
		conta2.pagarMensalidade();
		
		
		conta4.sacar(500);
		conta3.sacar(20);
		
		//System.out.println(cliente1.contemContaCliente(conta1));
		System.out.println(cliente1);
		
		//conta4.transferencia(null, 0f);
	
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	
	}		
		 
}
	
