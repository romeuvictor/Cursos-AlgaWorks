package Collections;

import java.util.ArrayList;
import java.util.List;

public class TesteListArrayList {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Pedro");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("José");		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		
		imprimirAlunos(alunos);

	}
	
	public static void imprimirAlunos(List<Aluno> alunos) {
		
		for(Aluno a :  alunos) {
			System.out.println("Nome: " + a.getNome());
			
			
		}
		
		
	}

}
