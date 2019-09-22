package visao;
import java.util.Scanner;
import modelo.Aluno;

public class App {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			
			String nomeTemp, matriculaTem, cpfTemp, endTemp, dados;
			System.out.println("Digite os dados");
			System.out.println("NOME");
			nomeTemp = scn.nextLine();
			System.out.println("MATRICULA");
			matriculaTem = scn.nextLine();
			System.out.println("Endereco");
			endTemp = scn.nextLine();
			System.out.println("CPF ");
			cpfTemp = scn.nextLine();
			
			Aluno aluno = new Aluno(nomeTemp, matriculaTem, endTemp, cpfTemp);
			dados = aluno.infoAluno();
			System.out.println(dados);
	}

}
