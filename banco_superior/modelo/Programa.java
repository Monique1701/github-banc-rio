package banco_superior.modelo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Taxa de adm: "+Conta.TAXA_ADMINISTRACAO);
		
		
		Conta conta1 = new ContaCorrente("222", "AA", "Tereza", "030", "24-12-2020");
		
		Conta conta2 = new ContaPoupanca("122", "AA", "Monique", "030", "24-12-2020");
		
		System.out.println("CONTAS CRIADAS SEM SALDO: ");
		System.out.println(conta1);
		System.out.println(conta2);
		
		conta1.depositar(1000f);
		conta2.depositar(100f);
		

		System.out.println("CONTAS CRIADAS COM SALDO: ");
		System.out.println(conta1);
		System.out.println(conta2);
		
		conta1.transferencia(conta2, 100f);
		
		System.out.println("CONTAS APÓS TRANSFERÊNCIA: ");
		System.out.println(conta1);

		System.out.println(conta2);
		
		
		
		

		

	}		
		 
}
	
