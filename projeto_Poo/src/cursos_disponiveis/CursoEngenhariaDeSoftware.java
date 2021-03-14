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
			System.out.println("Solicita��o aprovada!");
		}
		else {
			throw new SolicitacaoIndeferidaException("Solicita��o indeferida!");
		}
	}
	
	
	
	

	public void pagarMensalidade(boolean statusDeMatricula, double quantia) throws MensalidadeNaoRealizadaException {
		if(statusDeMatricula == true && quantia == 1005) {
			System.out.println("Mensalidade paga");
		}
		else {
			throw new MensalidadeNaoRealizadaException("Mensalidade n�o realizada! Verique se sua matricula est� ativa e se voc� deu a quantia exata");
		}
		
	}
	
	
	
	
	
}
