import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> alunos = new HashMap<>();

        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Selecionar Aluno");
            System.out.println("3 - Alterar Nota do Aluno");
            System.out.println("4 - Excluir Aluno");
            System.out.println("5 - Estatísticas");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno(alunos, scanner);
                    break;
                case 2:
                    selecionarAluno(alunos, scanner);
                    break;
                case 3:
                    alterarNota(alunos, scanner);
                    break;
                case 4:
                    excluirAluno(alunos, scanner);
                    break;
                case 5:
                    exibirEstatisticas(alunos);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarAluno(Map<String, Double> alunos, Scanner scanner) {
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Informe a nota do aluno: ");
        double nota = scanner.nextDouble();

        alunos.put(nome, nota);
        System.out.println("Aluno cadastrado com sucesso!");
    }

    private static void selecionarAluno(Map<String, Double> alunos, Scanner scanner) {
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        if (alunos.containsKey(nome)) {
            double nota = alunos.get(nome);
            System.out.println("Aluno: " + nome + ", Nota: " + nota);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void alterarNota(Map<String, Double> alunos, Scanner scanner) {
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        if (alunos.containsKey(nome)) {
            System.out.print("Informe a nova nota do aluno: ");
            double novaNota = scanner.nextDouble();
            alunos.put(nome, novaNota);
            System.out.println("Nota alterada com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void excluirAluno(Map<String, Double> alunos, Scanner scanner) {
        System.out.print("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        if (alunos.containsKey(nome)) {
            alunos.remove(nome);
            System.out.println("Aluno excluído com sucesso!");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private static void exibirEstatisticas(Map<String, Double> alunos) {
        int totalAlunos = alunos.size();
        int aprovados = 0;
        int reprovados = 0;

        for (double nota : alunos.values()) {
            if (nota >= 6.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        System.out.println("=== Estatísticas ===");
        System.out.println("Total de Alunos: " + totalAlunos);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }
}
