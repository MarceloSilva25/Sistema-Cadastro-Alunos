import java.util.ArrayList;
import java.util.List;

public class sistemaCadastro {
    private final List<Aluno> listaAlunos = new ArrayList<>();

    public void cadastrarAluno(int id, String nome, String email) {
        Aluno novoAluno = new Aluno(id, nome, email);
        listaAlunos.add(novoAluno);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    public void visualizarTodos(){
        if (listaAlunos.isEmpty()){
            System.out.println("nenhum alunos encontrado");
        } else {
            System.out.println("\n--- Lista de Alunos ---");
            for (Aluno a : listaAlunos) {
                System.out.println(a.getInfo());
            }
        }
    }
}

