package cursos_disponiveis;

import sistema_maricula_exececao.MensalidadeNaoRealizadaException;
import sistema_maricula_exececao.SolicitacaoIndeferidaException;

public class CursoEngenhariaDeSoftware implements ICurso{
	
	private String areaDeInteresse;
	private float mediaMatEM;
	private boolean statusDeMatricula;
	private double mensalidade;
	

	
	public CursoEngenhariaDeSoftware(String areaDeInteresse, float mediaMatEM,
			double mensalidade) {
		super();
		this.areaDeInteresse = areaDeInteresse;
		this.mediaMatEM = mediaMatEM;
		this.statusDeMatricula = true;
		this.mensalidade = 1005;
		
		
		
	}
	
	




	public void solicitarPedidoDeMatricula(float mediaMatEM ) throws SolicitacaoIndeferidaException{
		if(mediaMatEM >= 7.5) {
			System.out.println("Solicitação aprovada!");
		}
		else {
			throw new SolicitacaoIndeferidaException("Solicitação indeferida!");
		}
	}
	
	
	
	

	public void pagarMensalidade(boolean statusDeMatricula, double quantia) throws MensalidadeNaoRealizadaException {
		if(statusDeMatricula == true && quantia == 1005) {
			System.out.println("Mensalidade paga");
		}
		else {
			throw new MensalidadeNaoRealizadaException("Mensalidade não realizada! Verique se sua matricula está ativa e se você deu a quantia exata");
		}
		
	}
	
	
	
	
	
}
