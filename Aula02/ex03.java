import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Map<String, String>> listaProdutos = new ArrayList<>();

        while (true) {
            System.out.println("\n*** Menu ***");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Exibir todos os registros");
            System.out.println("3. Quantidade de produtos por segmento");
            System.out.println("4. Alterar dados de um produto");
            System.out.println("5. Remover produto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto(listaProdutos, scanner);
                    break;
                case 2:
                    exibirTodosRegistros(listaProdutos);
                    break;
                case 3:
                    exibirQuantidadePorSegmento(listaProdutos);
                    break;
                case 4:
                    alterarDadosProduto(listaProdutos, scanner);
                    break;
                case 5:
                    removerProduto(listaProdutos, scanner);
                    break;
                case 6:
                    System.out.println("Saindo do programa. Até mais!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void cadastrarProduto(ArrayList<Map<String, String>> listaProdutos, Scanner scanner) {
        Map<String, String> produto = new HashMap<>();

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o segmento do produto: ");
        String segmento = scanner.nextLine();

        produto.put("Nome", nome);
        produto.put("Segmento", segmento);

        listaProdutos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    private static void exibirTodosRegistros(ArrayList<Map<String, String>> listaProdutos) {
        for (Map<String, String> produto : listaProdutos) {
            System.out.println(produto);
        }
    }

    private static void exibirQuantidadePorSegmento(ArrayList<Map<String, String>> listaProdutos) {
        Map<String, Integer> quantidadePorSegmento = new HashMap<>();

        for (Map<String, String> produto : listaProdutos) {
            String segmento = produto.get("Segmento");
            quantidadePorSegmento.put(segmento, quantidadePorSegmento.getOrDefault(segmento, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : quantidadePorSegmento.entrySet()) {
            System.out.println("Segmento: " + entry.getKey() + ", Quantidade: " + entry.getValue());
        }
    }

    private static void alterarDadosProduto(ArrayList<Map<String, String>> listaProdutos, Scanner scanner) {
        System.out.print("Digite o nome do produto que deseja alterar: ");
        String nomeProduto = scanner.nextLine();

        for (Map<String, String> produto : listaProdutos) {
            if (produto.get("Nome").equals(nomeProduto)) {
                System.out.println("Digite as novas informações do produto:");
                cadastrarProduto(listaProdutos, scanner);
                listaProdutos.remove(produto);
                System.out.println("Produto alterado com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado. Nenhuma alteração realizada.");
    }

    private static void removerProduto(ArrayList<Map<String, String>> listaProdutos, Scanner scanner) {
        System.out.print("Digite o nome do produto que deseja remover: ");
        String nomeProduto = scanner.nextLine();

        for (Map<String, String> produto : listaProdutos) {
            if (produto.get("Nome").equals(nomeProduto)) {
                listaProdutos.remove(produto);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }

        System.out.println("Produto não encontrado. Nenhuma remoção realizada.");
    }
}
