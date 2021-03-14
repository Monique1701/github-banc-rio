package sistema_matricula;

import java.util.ArrayList;
import java.util.List;





public class AlunoEnsinoMedio implements IAluno{
	
	private String nomeCompleto;
	private String nomeRespondavel;
	private String dataNascimento;
	private String cpf;
	private String cpfResponsavel;
	private int idade;
	private String turno;
	private int serie;
	private String endereco;
	private boolean statusDaMatricula;

	
	private List<IAluno> alunos = new ArrayList<IAluno>();
	
	public AlunoEnsinoMedio(String nomeCompleto, String nomeResponsavel, String dataNascimentp,String cpf, String cpfResponsavel, int idade, String turno, int serie,
			String endereco) {
		super();
		this.nomeRespondavel = nomeResponsavel;
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.cpfResponsavel = cpfResponsavel;
		this.idade = idade;
		this.turno = turno;
		this.serie = serie;
		this.endereco = endereco;
		this.statusDaMatricula = true;
		this.dataNascimento = dataNascimento;
	}
	
	
	





	@Override
	public void localizarPorMatricula(IAluno matriculAluno) {
		// TODO Auto-generated method stub
		
	}
	




	public void ativarMatricula() {
		this.statusDaMatricula = true;
	}
	
	
	public void desativarMatricula() {
		this.statusDaMatricula = false; 
	}





	public void adicionarAluno(IAluno aluno) {
		// TODO Auto-generated method stub
		this.alunos.add(aluno);
	}

















	




	
	

}
