/*
Atividade avaliativa - Unidade 1 (listas, filas e pilhas)

A atividade deverá estar disponível no GitHub. O último commit deverá ser feito no dia 18/03 até às 11:10.

	Você foi contratado para desenvolver um sistema de gerenciamento de tarefas para uma equipe de desenvolvimento de software na linguagem Java. 
- O sistema deve permitir que os membros da equipe adicionem tarefas, removam tarefas concluídas e visualizem as próximas tarefas a serem realizadas.  
- O sistema deve ser capaz de lidar com as seguintes operações:
- Adicionar uma nova tarefa à lista.
- Concluir uma tarefa, removendo-a da lista.
- Visualizar a próxima tarefa a ser realizada.

	Requisitos adicionais: 
- As tarefas devem ser armazenadas em uma estrutura de dados que permita a fácil adição e remoção de elementos. 
- A visualização da próxima tarefa deve ser feita de forma eficiente, sem a necessidade de percorrer toda a lista de tarefas. 
- O sistema deve ser escalável e capaz de lidar com um grande número de tarefas.

Instruções:  
- Projete e implemente o sistema de gerenciamento de tarefas usando uma das seguintes estruturas de dados: lista, fila ou pilha. 
- Ao implementar a estrutura de dados escolhida, forneça uma explicação detalhada do motivo pelo qual você escolheu essa estrutura em particular (crie um README para isso).
- Teste o sistema com diferentes cenários para garantir que ele funcione conforme o esperado.
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

class GerenciadorTarefas {
    private Queue<Tarefa> filaTarefas;

    public GerenciadorTarefas() {
        this.filaTarefas = new LinkedList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        filaTarefas.add(tarefa);
    }

    public void concluirTarefa() {
        Scanner scanner = new Scanner(System.in);
        if (!filaTarefas.isEmpty()) {
            System.out.println("Selecione qual tarefa deseja concluir:");
            listarTarefas();
            if (scanner.hasNextInt()) {
                int indiceTarefa = scanner.nextInt();
                scanner.nextLine();
                if (indiceTarefa > 0 && indiceTarefa <= filaTarefas.size()) {
                    int contador = 1;
                    for (Tarefa tarefa : filaTarefas) {
                        if (contador == indiceTarefa) {
                            filaTarefas.remove(tarefa);
                            System.out.println("Tarefa concluída.");
                            break;
                        }
                        contador++;
                    }
                } else {
                    System.out.println("Índice inválido. Por favor, selecione novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.nextLine();
            }
        } else {
            System.out.println("Não há tarefas para concluir.");
        }
    }

    public void listarTarefas() {
        if (!filaTarefas.isEmpty()) {
            System.out.println("Lista de Tarefas:");
            int contador = 1;
            for (Tarefa tarefa : filaTarefas) {
                System.out.println(contador + ". " + tarefa.getDescricao());
                contador++;
            }
        } else {
            System.out.println("Nenhuma tarefa pendente.");
        }
    }

    public void imprimirProximaTarefa() {
        if (!filaTarefas.isEmpty()) {
            System.out.println("Tarefas Pendentes:");
            Queue<Tarefa> filaCopia = new LinkedList<>(filaTarefas);
            int contador = 1;
            while (!filaCopia.isEmpty()) {
                Tarefa tarefa = filaCopia.poll();
                System.out.println(contador + ". " + tarefa.getDescricao());
                contador++;
            }
        } else {
            System.out.println("Nenhuma tarefa pendente.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Concluir Tarefa");
            System.out.println("3. Visualizar Próximas Tarefa");
            System.out.println("4. Sair");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
                switch (opcao) {
                    case 1:
                        System.out.println("Digite a descrição da tarefa:");
                        String descricaoTarefa = scanner.nextLine();
                        gerenciadorTarefas.adicionarTarefa(new Tarefa(descricaoTarefa));
                        System.out.println("Tarefa adicionada com sucesso!");
                        break;
                    case 2:
                        gerenciadorTarefas.concluirTarefa();
                        break;
                    case 3:
                        gerenciadorTarefas.imprimirProximaTarefa();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, escolha novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.nextLine(); 
                opcao = 0;
            }
        } while (opcao != 4);

        scanner.close();
    }
}

