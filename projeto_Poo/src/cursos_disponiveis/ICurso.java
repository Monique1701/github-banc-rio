package cursos_disponiveis;

import sistema_maricula_exececao.MensalidadeNaoRealizadaException;
import sistema_maricula_exececao.SolicitacaoIndeferidaException;

public interface ICurso {

	public void solicitarPedidoDeMatricula(float mediaMatEM) throws SolicitacaoIndeferidaException;
	
	public void pagarMensalidade(boolean statusDeMatricula, double quantia) throws MensalidadeNaoRealizadaException;
}
