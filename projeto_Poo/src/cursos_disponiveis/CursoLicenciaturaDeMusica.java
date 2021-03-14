package cursos_disponiveis;

import sistema_maricula_exececao.MensalidadeNaoRealizadaException;

import sistema_maricula_exececao.SolicitacaoIndeferidaException;

public class CursoLicenciaturaDeMusica implements ICurso{

	private String classificacaVocal;
	private String experienciaInstrumental;
	private String instrumentoDePreferencia;
	private boolean statusDeMatricula;
	private double mensalidade;
	
	
	

	public CursoLicenciaturaDeMusica(String classificacaVocal, String experienciaInstrumental,
			String instrumentoDePreferencia) {
		super();
		this.classificacaVocal = classificacaVocal;
		this.experienciaInstrumental = experienciaInstrumental;
		this.instrumentoDePreferencia = instrumentoDePreferencia;
		this.statusDeMatricula = true;
		this.mensalidade =  505.50;
		
	}


	

	public void pagarMensalidade(boolean statusDeMatricula, double quantia) throws MensalidadeNaoRealizadaException{
		if(statusDeMatricula == true && quantia == 505.50) {
			System.out.println("Mensalidade realizada com sucesso");
		}
		else {
			throw new MensalidadeNaoRealizadaException("Mensalidade não realizada! Verique se sua matricula está ativa e se você deu a quantia exata");
		}
	}


	@Override
	public void solicitarPedidoDeMatricula(float mediaMatEM) throws SolicitacaoIndeferidaException{
		// TODO Auto-generated method stub
		if(experienciaInstrumental == "7.5") {
			System.out.println("Solicitação aprovada!");
		}
		else {
			throw new SolicitacaoIndeferidaException("Solicitação indeferida!");
		}
	}




}
