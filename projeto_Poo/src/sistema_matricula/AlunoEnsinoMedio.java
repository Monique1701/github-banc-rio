package sistema_matricula;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;





public class AlunoEnsinoMedio implements IAluno{
	
	private String nomeCompleto;
	private String nomeRespondavel;
	private Date dataNascimento;
	private String cpf;
	private String cpfResponsavel;
	private int idade;
	private String turno;
	private int serie;
	private String endereco;
	private boolean statusDaMatricula;

	
	private List<IAluno> alunos = new ArrayList<IAluno>();
	
	public AlunoEnsinoMedio(String nomeCompleto, String nomeResponsavel, String cpf, String cpfResponsavel, int idade, String turno, int serie,
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
	
	
	public class Date{
		private int dia, mes, ano;
		public Date(int d, int m, int a) {
			if(dataValida(dia, mes)) {
				dia = d;
				mes= m;
				ano = a;
			}
			else {
				dia = 0;
				mes = 0;
				ano = 0;
				
			}
		}
	}
	
	
	public boolean dataValida(int d, int m) {
		if((d >= 1)&& (d <= 31)&& (m >= 1)&& (m <= 12)){
			
		
		}
		else {
			return false;
		}
		return false;
		
	}





	




	
	

}
