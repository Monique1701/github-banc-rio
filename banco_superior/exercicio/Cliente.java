package banco_superior.exercicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class Cliente {
	
	private String nome;
	private String cpf;
	private String dataNascimento;
	
	private HashSet<String> telefones = new HashSet<String>();
	
	private List<IConta> contas = new ArrayList<IConta>();
;	
	
	public Cliente(String nome, String cpf, String dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", telefones="
				+ telefones + ", contas=" + contas + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		
		Cliente other = (Cliente) obj;
		if (cpf == null) {
			
			if (other.cpf != null) {
				return false;
			}
				
		} else if (!cpf.equals(other.cpf)) {
			return false;
		}
			
		return true;
	}
	
	protected void adicionarContaCliente(IConta contaCliente)
	{
		this.contas.add(contaCliente);
	}
	
	public boolean contemContaCliente(IConta conta)
	{
		return this.contas.contains(conta);                                                               
	}
	
	
	public void removerConta(IConta conta)
	{
		if(contas.contains(conta)) 
		{
			contas.remove(conta);
			System.out.println("Conta removida com sucesso");
		}
		else 
		{
			System.out.println("Conta Inexistente");
			
		}
	}
	 public void adicionarTelefone(String telefone)
	 {
		 this.telefones.add(telefone);
	 }
	 
	 public void removerTelefone(String telefone)
	 {
		 if(telefones.contains(telefone))
		 {
			 telefones.remove(telefone);
		 }
		 else 
		 {
			 System.out.println("Cliente não tem o referido relefone");
		 }
	 }
	
	
	
	

}
