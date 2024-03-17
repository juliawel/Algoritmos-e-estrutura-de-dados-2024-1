import java.util.Scanner;
import java.util.Vector;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> registros = new Vector<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Selecionar todos os registros");
            System.out.println("3. Pesquisar por termo");
            System.out.println("4. Alterar dados");
            System.out.println("5. Remover registro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrar(registros, scanner);
                    break;
                case 2:
                    selecionarTodos(registros);
                    break;
                case 3:
                    pesquisarPorTermo(registros, scanner);
                    break;
                case 4:
                    alterarDados(registros, scanner);
                    break;
                case 5:
                    removerRegistro(registros, scanner);
                    break;
                case 6:
                    System.out.println("Encerrando o programa. Até mais!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrar(Vector<String> registros, Scanner scanner) {
        System.out.print("Digite o novo registro: ");
        String novoRegistro = scanner.nextLine();

        if (!registros.contains(novoRegistro)) {
            registros.add(novoRegistro);
            System.out.println("Registro cadastrado com sucesso!");
        } else {
            System.out.println("Registro já existe. Cadastro não realizado.");
        }
    }

    private static void selecionarTodos(Vector<String> registros) {
        if (registros.isEmpty()) {
            System.out.println("Não há registros cadastrados.");
        } else {
            System.out.println("Registros cadastrados:");
            for (String registro : registros) {
                System.out.println(registro);
            }
        }
    }

    private static void pesquisarPorTermo(Vector<String> registros, Scanner scanner) {
        System.out.print("Digite o termo de pesquisa: ");
        String termo = scanner.nextLine();

        System.out.println("Resultados da pesquisa:");
        for (String registro : registros) {
            if (registro.contains(termo)) {
                System.out.println(registro);
            }
        }
    }

    private static void alterarDados(Vector<String> registros, Scanner scanner) {
        System.out.print("Digite o registro que deseja alterar: ");
        String registroAntigo = scanner.nextLine();

        if (registros.contains(registroAntigo)) {
            System.out.print("Digite o novo valor: ");
            String novoValor = scanner.nextLine();

            registros.set(registros.indexOf(registroAntigo), novoValor);
            System.out.println("Registro alterado com sucesso!");
        } else {
            System.out.println("Registro não encontrado. Alteração não realizada.");
        }
    }

    private static void removerRegistro(Vector<String> registros, Scanner scanner) {
        System.out.print("Digite o registro que deseja remover: ");
        String registroRemover = scanner.nextLine();

        if (registros.contains(registroRemover)) {
            registros.remove(registroRemover);
            System.out.println("Registro removido com sucesso!");
        } else {
            System.out.println("Registro não encontrado. Remoção não realizada.");
        }
    }
}
