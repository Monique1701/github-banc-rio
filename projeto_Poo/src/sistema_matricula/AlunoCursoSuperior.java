package sistema_matricula;

import java.util.ArrayList;
import java.util.List;






public class AlunoCursoSuperior {
	
	private String endereco;
	private String telefone;
	private String titulo;
	private String curso;
	private String nomeCompleto;
	private String cpf;
	private String turno;
	private boolean statusDaMatricula;

	private List<IAluno> alunos = new ArrayList<IAluno>();
	
	
	
	
	public AlunoCursoSuperior(String endereco, String telefone, String titulo, String curso, String nomeCompleto,
			String cpf, String turno, boolean statusDaMatricula) {
		super();
		this.endereco = endereco;
		this.telefone = telefone;
		this.titulo = titulo;
		this.curso = curso;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.turno = turno;
		this.statusDaMatricula = statusDaMatricula;
	}
	
	
	
	private void trancarCurso(boolean statusDaMatricula) {
		this.statusDaMatricula = false;
		
		
	}




	public String getNomeCompleto() {
		return nomeCompleto;
	}



	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	
	
	

}
