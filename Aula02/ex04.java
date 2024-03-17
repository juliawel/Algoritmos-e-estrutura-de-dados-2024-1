import java.util.LinkedList;
import java.util.Scanner;

class Node {
    String registro;
    Node anterior;
    Node proximo;

    Node(String registro) {
        this.registro = registro;
        this.anterior = null;
        this.proximo = null;
    }
}

public class ex04 {

    public static void main(String[] args) {
        LinkedList<Node> lista = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== Menu ====");
            System.out.println("1. Cadastrar");
            System.out.println("2. Selecionar");
            System.out.println("3. Alterar");
            System.out.println("4. Excluir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrar(lista, scanner);
                    break;
                case 2:
                    selecionar(lista, scanner);
                    break;
                case 3:
                    alterar(lista, scanner);
                    break;
                case 4:
                    excluir(lista, scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);
    }

    private static void cadastrar(LinkedList<Node> lista, Scanner scanner) {
        System.out.print("Digite o registro a ser cadastrado: ");
        String novoRegistro = scanner.nextLine();
        Node novoNo = new Node(novoRegistro);
        
        if (!lista.isEmpty()) {
            Node ultimoNo = lista.getLast();
            novoNo.anterior = ultimoNo;
            ultimoNo.proximo = novoNo;
        }
        
        lista.add(novoNo);
        System.out.println("Registro cadastrado com sucesso.");
    }

    private static void selecionar(LinkedList<Node> lista, Scanner scanner) {
        System.out.print("Digite o registro a ser selecionado: ");
        String registroSelecionado = scanner.nextLine();

        for (Node no : lista) {
            if (no.registro.equals(registroSelecionado)) {
                System.out.println("Registro encontrado: " + no.registro);
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }

    private static void alterar(LinkedList<Node> lista, Scanner scanner) {
        System.out.print("Digite o registro a ser alterado: ");
        String registroAlterar = scanner.nextLine();

        for (Node no : lista) {
            if (no.registro.equals(registroAlterar)) {
                System.out.print("Digite o novo valor para o registro: ");
                String novoValor = scanner.nextLine();
                no.registro = novoValor;
                System.out.println("Registro alterado com sucesso.");
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }

    private static void excluir(LinkedList<Node> lista, Scanner scanner) {
        System.out.print("Digite o registro a ser excluído: ");
        String registroExcluir = scanner.nextLine();

        for (Node no : lista) {
            if (no.registro.equals(registroExcluir)) {
                Node anterior = no.anterior;
                Node proximo = no.proximo;

                if (anterior != null) {
                    anterior.proximo = proximo;
                } else {
                    lista.removeFirst();
                }

                if (proximo != null) {
                    proximo.anterior = anterior;
                } else {
                    lista.removeLast();
                }

                System.out.println("Registro excluído com sucesso.");
                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }
}
