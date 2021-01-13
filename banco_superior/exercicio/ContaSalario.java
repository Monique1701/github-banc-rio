package banco_superior.exercicio;

public class ContaSalario implements IConta{
	//Atributos
	private String nome;
	String numeroConta;
	String agencia;
	private float saldo;
	protected String tipoConta;
	boolean status;
	String dataAbertura;
	
	

	public ContaSalario(String nome, String numeroConta, String agencia, String tipoConta, String dataAbertura) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0f;
		this.status = true;
		this.tipoConta = tipoConta;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public void sacar(float valorSacado) {
		if(valorSacado <= this.saldo && this.status) {
			this.saldo -= valorSacado;
		}
		
	}

	@Override
	public void depositar(float valorDepositado) {
		if(this.status == true) {
			this.saldo = this.saldo + valorDepositado;
			System.out.println("Seu deposito foi realizado " + this.nome);
		}else {
			System.out.println("IMPOSSÍVEL DEPOSITAR EM UMA CONTA FECHADA!");
		
		}
		
	}

	@Override
	public void desativarConta() {
		this.status = false;
		
	}

	@Override
	public void transferencia(IConta contaDestino, float valorTransferido) {
		if(contaDestino == null)
		{
			 System.err.println("Conta salário não faz transferência!");
		}
		
	}

	@Override
	public void ativarConta() {
		this.status = true;
		
	}



	@Override
	public String toString() {
		return "ContaSalario [nome=" + nome + ", numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo="
				+ saldo + ", tipoConta=" + tipoConta + ", status=" + status + ", dataAbertura=" + dataAbertura + "]";
	}

	@Override
	public void pagarMensalidade() {
		float valor = 0;
		if(this.tipoConta == "CC") {
			valor = 12;
		} else if(this.tipoConta == "CS") {
			valor = 11;
		}
		if(this.status) {
			this.saldo = this.saldo - valor;
			System.out.println(this.nome + " Sua mensalidade foi paga com sucesso!");
		} else {
			System.out.println("IMPOSSÍVEL PAGAR UMA CONTA FECHADA!");
		}
		
	}

	
	
	
	
	
	

}
