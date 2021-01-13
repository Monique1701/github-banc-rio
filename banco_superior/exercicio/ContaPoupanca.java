package banco_superior.exercicio;

public class ContaPoupanca implements IConta{
	//Atributos
	private String nome;
	String numeroConta;
	String agencia;
	private float saldo;
	boolean status;
	protected String tipoConta;
	String dataAbertura;
	
	
	public final float RENDIMENTO_POUPANCA = 0.03f;
	
	public ContaPoupanca(String nome, String numeroConta, String agencia, String tipoConta, String dataAbertura) {
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
		
		if(contaDestino instanceof ContaPoupanca) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		
		} else if(contaDestino instanceof ContaInvestimento) {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		
		} else {
			this.sacar(valorTransferido+(valorTransferido*TAXA_ADMINISTRACAO));
			contaDestino.depositar(valorTransferido);
		
		}
		
	}
	
	@Override
	public void sacar(float valorSacado) {
		if(valorSacado > 0 && this.saldo >= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_POUPANCA)) &&  this.status)
		{
			this.saldo -= (valorSacado+(valorSacado*CUSTO_SACAR_CONTA_POUPANCA));
		}
	
	}

	@Override
	public void depositar(float valorDepositado) {
		if(this.status == true) {
			this.saldo = this.saldo + valorDepositado;
			System.out.println("Seu deposito foi realizado " + this.nome);
		}else {
			System.out.println("IMPOSS�VEL DEPOSITAR EM UMA CONTA FECHADA!");
		
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
		return "ContaPoupanca [nome=" + nome + ", numeroConta=" + numeroConta + ", agencia=" + agencia + ", saldo="
				+ saldo + ", status=" + status + ", tipoConta=" + tipoConta + ", dataAbertura=" + dataAbertura
				+ ", RENDIMENTO_POUPANCA=" + RENDIMENTO_POUPANCA + "]";
	}

	@Override
	public void pagarMensalidade() {
		float valor = 0;
		if(this.tipoConta == "CI") {
			valor = 22;
		} else if(this.tipoConta == "CP") {
			valor = 20;
		}
		if(this.status) {
			this.saldo = this.saldo - valor;
			System.out.println("Mensalidade paga com sucesso  " + this.nome);
		} else {
			System.out.println("IMPOSS�VEL PAGAR UMA CONTA FECHADA!");
		}
	}

	
	
	


}