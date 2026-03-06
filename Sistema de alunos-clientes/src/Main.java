import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        sistemaCadastro sistema = new sistemaCadastro();

        int opcao = -1;

        System.out.println("=== Bem-vindo Ao Sistema De cadastro 2026 ===");

        while (opcao != 0) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Visualizar Todos");
            System.out.println("0. Sair");
            System.out.println("Opçao: ");

            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do aluno: ");
                    int id = leitor.nextInt();
                    leitor.nextLine(); // Limpar o buffer

                    System.out.print("Digite o nome do aluno: ");
                    String nome = leitor.nextLine();

                    System.out.print("Digite o email do aluno: ");
                    String email = leitor.nextLine();

                    sistema.cadastrarAluno(id, nome, email);
                    break;
                case 2:
                    sistema.visualizarTodos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
