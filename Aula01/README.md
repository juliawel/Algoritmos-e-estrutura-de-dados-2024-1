O que é estrutura de dados?
Estrutura de dados é uma forma organizada de armazenar e gerenciar dados de modo a facilitar a manipulação, acesso e organização desses dados dentro de um programa de computador. Elas fornecem uma maneira de representar e organizar informações de forma eficiente, permitindo a realização de operações como inserção, busca, remoção e ordenação de dados.

Importância da Estrutura de Dados:
A estrutura de dados é fundamental para o desenvolvimento de software eficiente e robusto. Ela permite que os desenvolvedores organizem e manipulem dados de maneira eficiente, o que é essencial para a criação de algoritmos e aplicativos de alta qualidade. Uma escolha adequada de estrutura de dados pode resultar em melhor desempenho, menor consumo de recursos e código mais limpo e legível.

Explicação e Exemplos das Estruturas:
Array Estático:
Descrição: Um array estático é uma estrutura de dados que armazena um número fixo de elementos do mesmo tipo em uma sequência contígua de memória.
Exemplo:
int[] numeros = new int[5];

Array Dinâmico:
Descrição: Um array dinâmico é uma estrutura de dados que pode crescer ou diminuir de tamanho durante a execução do programa.
Exemplo:
ArrayList<Integer> listaNumeros = new ArrayList<>();
listaNumeros.add(10);

Lista:
Descrição: Uma lista é uma estrutura de dados que armazena uma coleção ordenada de elementos, permitindo adição, remoção e acesso flexíveis aos elementos.
Exemplo:
LinkedList<String> listaNomes = new LinkedList<>();
listaNomes.add("Alice");

Fila:
Descrição: Uma fila é uma estrutura de dados que segue o princípio FIFO (First-In, First-Out), onde o primeiro elemento inserido é o primeiro a ser removido.
Exemplo:
Queue<String> filaClientes = new LinkedList<>();
filaClientes.add("João");

Pilha:
Descrição: Uma pilha é uma estrutura de dados que segue o princípio LIFO (Last-In, First-Out), onde o último elemento inserido é o primeiro a ser removido.
Exemplo:
Stack<String> pilhaLivros = new Stack<>();
pilhaLivros.push("Livro 1");
