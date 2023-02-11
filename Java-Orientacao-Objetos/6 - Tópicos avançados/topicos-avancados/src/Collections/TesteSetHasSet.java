package Collections;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHasSet {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Pedro");
		Aluno a3 = new Aluno("Maria");
		Aluno a4 = new Aluno("José");		
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		
		alunos.add(a1);
		alunos.add(a2);
		alunos.add(a3);
		alunos.add(a4);
		alunos.add(a4);
		
		imprimirAlunos(alunos);

	}
	public static void imprimirAlunos(Set<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " +aluno.getNome());
		}
	}

}
