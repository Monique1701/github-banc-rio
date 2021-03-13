package cursos_disponiveis;



public class CursoEngenhariaDeSoftware {
	
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
	
	
	
	
	
	@SuppressWarnings("unused")
	private void solicitarPedidoDeMatricula(float mediaMatEM ) {
		if(mediaMatEM >= 7.5) {
			System.out.println("Solicitação aprovada!");
		}
		else {
			System.out.println("Solicitação indeferida!");
		}
	}
	
		private void pagarMensalidade(boolean statusDeMatricula, double quantia) {
		if(statusDeMatricula == true && quantia == 1005) {
			System.out.println("Mensalidade paga");
		}
		else {
			System.out.println("Mensalidade não paga! Verique se sua matricula está ativa e se você deu a quantia exata");
		}
		
	}
}
