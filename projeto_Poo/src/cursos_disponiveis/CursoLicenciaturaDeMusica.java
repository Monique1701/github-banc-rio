package cursos_disponiveis;

public class CursoLicenciaturaDeMusica {

	private String classificacaVocal;
	private String experienciaInstrumental;
	private String instrumentoDePreferencia;
	private boolean statusDeMatricula;
	
	
	
	
	
	
	
	/**
	 * @param classificacaVocal
	 * @param experienciaInstrumental
	 * @param instrumentoDePreferencia
	 * @param statusDeMatricula
	 */
	public CursoLicenciaturaDeMusica(String classificacaVocal, String experienciaInstrumental,
			String instrumentoDePreferencia, boolean statusDeMatricula) {
		super();
		this.classificacaVocal = classificacaVocal;
		this.experienciaInstrumental = experienciaInstrumental;
		this.instrumentoDePreferencia = instrumentoDePreferencia;
		this.statusDeMatricula = statusDeMatricula;
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
	
	
	private void pagarMensalidade() {
		
	}

}
