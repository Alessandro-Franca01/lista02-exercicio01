package modelo;

public class Aluno {
	private String nome;
	private String matricula;
	private String endereco;
	private String cpf;
	
	public Aluno() {
		
	}
	public Aluno(String nome, String mat, String end, String cpf) {
		this.cpf = cpf;
		this.endereco = end;
		this.matricula = mat;
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String infoAluno() {
		String dados = "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nEndereco: "+this.endereco+"\nMatricula : "+this.matricula; 
		return dados;
	}
	
}
