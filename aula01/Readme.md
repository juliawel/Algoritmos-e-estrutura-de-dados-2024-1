O que é estrutura de dados?
  É uma maneira de organizar, gerenciar e armazenar dados de modo a permitir o acesso eficiente e a manipulação eficaz desses dados. 

Qual sua importância?
  Otimiza tempo de execução e o uso de memória para operadores comuns, como inserção, busca, remoção e atualização de dados. 

Explique e exemplifique as estruturas: array (estático e dinâmico), lista, fila e pilha.

  Array: permite armazenar uma coleção de elementos do mesmo tipo sob um único nome. Podemos ter um array unidimencional (vetor) e multidimencional (matriz). Além disso, dependendo da arquitetura do sistema, podemos adotar duas maneiras para trabalharmos com a alocação de memória, sendo elas,
Estática (Ao criar um array, pré-definimos a quantidade máxima de registros):

  public class Exemplo{
    int[] numeros = new int[10]
  }
  
  ou dinâmica (Existe um método para aumentar a capacidade dinamicamente):
  
  public class Exemplo{
    int[] numeros;
  
  public Exemplo(){
    this.numeros = new int[10];
  }
  }

  Lista: o padrão de lista é normalmente implementado usando a interface List. Esta interface define um contrato para uma lista ordenada de elementos, onde cada elemento tem um índice associado.  Existem várias classes que implementam a interface List, sendo as mais comuns:  
ArrayList: Implementação de lista baseada em array, e LinkedList: Implementação de lista duplamente encadeada. 

  List<String> listaNomes = new ArrayList<>();
  listaNomes.add("nome0");
  listaNomes.add("nome1");
  listaNomes.add("nome2");
  
  System.out.println("Nomes: "+listaNomes);
  
  listaNomes.remove(1);
  
  System.out.println("Nomes: "+listaNomes);

  Fila: o padrão fila ou queue é uma estrutura de dados que segue o princípio "primeiro a entrar, primeiro a sair" (FIFO - First-In-First-Out). Isso significa que o primeiro elemento inserido na fila será o primeiro a ser removido, esse é um dos padrões mais utilizados nos projetos

  Queue<String> fila = new LinkedList<>();
  
  fila.offer("Elemento 1");
  fila.offer("Elemento 2");
  fila.offer("Elemento 3");
  System.out.println("Fila: " + fila);
  
  String elementoRemovido = fila.poll();
  System.out.println("Elemento removido: " + elementoRemovido);
  System.out.println("Fila após remoção: " + fila);
  
  String elementoFrente = fila.peek();
  System.out.println("Elemento da frente: " + elementoFrente);
  System.out.println("Fila após peek: " + fila);

  Pilha: é uma estrutura de dados que segue o princípio Last In, First Out (LIFO), onde o último elemento inserido é o primeiro a ser removido. Ela suporta duas operações principais: empilhar (push), que adiciona um elemento ao topo da pilha, e desempilhar (pop), que remove o elemento do topo.
  
  Stack<Integer> pilha = new Stack<>();
  pilha.push(10);
  pilha.push(20);
  pilha.push(30);
  
  System.out.println("Topo da pilha: " + pilha.peek());
  
  int elementoRemovido = pilha.pop();
  System.out.println("Elemento removido: " + elementoRemovido);
  
  System.out.println("Novo topo da pilha: " + pilha.peek());
















