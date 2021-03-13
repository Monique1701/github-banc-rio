package cursos_disponiveis;

public class CursoLicenciaturaDeMusica {

	private String classificacaVocal;
	private String experienciaInstrumental;
	private String instrumentoDePreferencia;
	private boolean statusDeMatricula;
	private double mensaildade;
	
	
	
	
	

	public CursoLicenciaturaDeMusica(String classificacaVocal, String experienciaInstrumental,
			String instrumentoDePreferencia, boolean statusDeMatricula) {
		super();
		this.classificacaVocal = classificacaVocal;
		this.experienciaInstrumental = experienciaInstrumental;
		this.instrumentoDePreferencia = instrumentoDePreferencia;
		this.statusDeMatricula = statusDeMatricula;
		this.mensalidade = 505.50;
	}


	@SuppressWarnings("unused")
	private void solicitarPedidoDeMatricula(String experienciaInstrumental) {
		if(experienciaInstrumental == "7.5") {
			System.out.println("Solicitação aprovada!");
		}
		else {
			System.out.println("Solicitação indeferida!");
		}
	}
	
		@SuppressWarnings("unused")
	private void pagarMensalidade(boolean statusDeMatricula, double quantia) {
		if(statusDeMatricula == true && quantia == 505.50) {
			System.out.println("Mensalidade paga");
		}
		else {
			System.out.println("Mensalidade não paga! Verique se sua matricula está ativa e se você deu a quantia exata");
		}
	}
	
	

}
