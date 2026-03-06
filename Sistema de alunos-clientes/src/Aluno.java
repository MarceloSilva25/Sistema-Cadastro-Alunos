public class Aluno {
    private final int id;
    private final String nome;
    private final String email;

    public Aluno(int id, String nome, String email){
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getInfo() {
        return "ID: " + id + "\nNome: " + nome + "\nEmail: " + email;
    }
}