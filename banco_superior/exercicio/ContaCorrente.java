package banco_superior.exercicio;

public class ContaCorrente implements IConta {
	private String nome;
	String numeroConta;
	String agencia;
	private float saldo;
	protected String tipoConta;
	boolean status;
	String dataAbertura;
	
	static final float TAXA_MANUTENCAO = 0.01f;
	
	public ContaCorrente(String nome, String numeroConta, String agencia, String tipoConta, String dataAbertura) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.saldo = 0f;
		this.tipoConta = tipoConta;
		this.status = true;
		this.dataAbertura = dataAbertura;
	}


	
	@Override
	public void transferencia(IConta contaDestino, float valorTransferido) {
		// TODO Auto-generated method stub
	
		if(contaDestino instanceof ContaPoupanca) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		
		}	else if(contaDestino instanceof ContaCorrente) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		} else {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
			
		}
		
	}


	
	@Override
	public void sacar(float valorSacado) {
		if(valorSacado > 0 && this.saldo >= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_CORRENTE)) &&  this.status)
		{
			this.saldo -= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_CORRENTE));
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
		return "ContaCorrente [nome=" + nome + ", numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo="
				+ saldo + ", tipoConta=" + tipoConta + ", status=" + status + ", dataAbertura=" + dataAbertura + "]";
	}



	@Override
	public void pagarMensalidade() {
		float valor = 0;
		if(this.tipoConta == "CC") {
			valor = 12;
		} else if(this.tipoConta == "CP") {
			valor = 20;
		}
		if(this.status) {
			this.saldo = this.saldo - valor;
			System.out.println("Mensalidade paga com sucesso " + this.nome);
		} else {
			System.out.println("IMPOSSÍVEL PAGAR UMA CONTA FECHADA!");
		}
		
	}

	



	
	





	
}