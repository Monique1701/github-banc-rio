package banco_superior.exercicio;

public class ContaInvestimento implements IConta {
	//Atributos
	private String nome;
	String numeroConta;
	String agencia;
	private float saldo;
	boolean status;
	protected String tipoConta;
	String dataAbertura;
	
	public final float CUSTO_SACAR_CONTA_INVESTIMENTO = 0.01f;

	
	public ContaInvestimento(String nome, String numeroConta, String agencia, String tipoConta, String dataAbertura) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0f;
		this.status = true;
		this.tipoConta = tipoConta;
		this.dataAbertura = dataAbertura;
	}

	@Override
	public void transferencia(IConta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
		
		if(contaDestino instanceof ContaInvestimento) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else if(contaDestino instanceof ContaCorrente) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		}
		
	}

	@Override
	public void sacar(float valorSacado) {
		if(valorSacado > 0 && this.saldo >= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_INVESTIMENTO)) &&  this.status)
		{
			this.saldo -= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_INVESTIMENTO));
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
	public void ativarConta() {
		this.status = true;
		
	}

	

	@Override
	public String toString() {
		return "ContaInvestimento [nome=" + nome + ", numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo="
				+ saldo + ", status=" + status + ", tipoConta=" + tipoConta + ", dataAbertura=" + dataAbertura
				+ ", CUSTO_SACAR_CONTA_INVESTIMENTO=" + CUSTO_SACAR_CONTA_INVESTIMENTO + "]";
	}

	@Override
	public void pagarMensalidade() {
		float valor = 0;
		if(this.tipoConta == "CC") {
			valor = 12;
		} else if(this.tipoConta == "CI") {
			valor = 22;
		}
		if(this.status) {
			this.saldo = this.saldo - valor;
			System.out.println("Sua mensalidade " + this.nome + " foi paga com sucesso!");
		} else {
			System.out.println("IMPOSSÍVEL PAGAR UMA CONTA FECHADA!");
		}
		
	}


	
	
	
	

}
