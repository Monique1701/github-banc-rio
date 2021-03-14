package sistema_matricula;

import java.util.ArrayList;
import java.util.List;

import cursos_disponiveis.ICurso;

public class AlunoCursoSuperior implements ICurso{
	
	private String endereco;
	private String telefone;
	private String titulo;
	private String nomeCompleto;
	private String cpf;
	private String turno;
	private boolean statusDaMatricula;
	private String matricula;


	private List<ICurso> cursos = new ArrayList<ICurso>();
	
	
	public AlunoCursoSuperior(String endereco, String telefone, String titulo, String nomeCompleto,
			String cpf, String turno, boolean statusDaMatricula, String matricula) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
		this.titulo = titulo;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.turno = turno;
		this.statusDaMatricula = statusDaMatricula;
		this.matricula = matricula;
	}
	
	
	

	@Override
	public String toString() {
		return "AlunoCursoSuperior [endereco=" + endereco + ", telefone=" + telefone + ", titulo=" + titulo
				+ ", nomeCompleto=" + nomeCompleto + ", cpf=" + cpf + ", turno=" + turno + ", statusDaMatricula="
				+ statusDaMatricula + ", matricula=" + matricula + ", cursos=" + cursos + "]";
	}








	public void adicionarCurso(String cursoEscolhido) {
		
	}


	
	
	public void trancarCurso(boolean statusDaMatricula) {
		this.statusDaMatricula = false;
		
		
	}
	
	@Override
	public void solicitarPedidoDeMatricula(float mediaMatEM) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagarMensalidade(boolean statusDeMatricula, double quantia) {
		// TODO Auto-generated method stub
		
	}




	public List<ICurso> getCursos() {
		return cursos;
	}



	public void setCursos(List<ICurso> cursos) {
		this.cursos = cursos;
	}



	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}




	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}







	
	
	

}
