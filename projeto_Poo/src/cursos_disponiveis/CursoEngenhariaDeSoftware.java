package cursos_disponiveis;



public class CursoEngenhariaDeSoftware {
	
	private String areaDeInteresse;
	private float mediaMatEM;
	
	
	
	
	
	
	@SuppressWarnings("unused")
	private void solicitarPedidoDeMatricula(float mediaMatEM ) {
		if(mediaMatEM >= 7.5) {
			System.out.println("Solicita��o aprovada!");
		}
		else {
			System.out.println("Solicita��o indeferida!");
		}
	}
}
