-Citar os quatro tipos de armazenamentos (Vector, ArrayList, LinkedList e HashMap). 
-Faça um breve resumo de cada um.
-Descreva as características.
-Exemplifique cada um (o exemplo não precisa ser código, apenas um texto).

1. Vector:
Descrição: Vector é uma classe da biblioteca padrão do Java que implementa uma lista redimensionável de objetos. Ele é semelhante a um array, mas com tamanho dinâmico.
Características: Os elementos em um Vector são acessados através de um índice inteiro. Ele é sincronizado, o que significa que é seguro para threads, mas pode resultar em uma performance um pouco mais lenta em comparação com outras estruturas de dados não sincronizadas.
Exemplo: Um Vector pode ser usado para armazenar uma lista de produtos em um carrinho de compras online, onde os itens podem ser adicionados e removidos dinamicamente.

2. ArrayList:
Descrição: ArrayList é uma implementação da interface List que utiliza um array dinâmico para armazenar os elementos. Ele é uma das estruturas de dados mais usadas em Java.
Características: ArrayList permite adicionar, remover, acessar e percorrer os elementos rapidamente. Ele não é sincronizado, o que o torna mais eficiente em ambientes de aplicativos de thread única.
Exemplo: Um ArrayList pode ser utilizado para armazenar uma lista de contatos em um aplicativo de agenda, permitindo adicionar, remover e pesquisar contatos de forma eficiente.

3. LinkedList:
Descrição: LinkedList é uma implementação da interface List que utiliza uma lista duplamente encadeada para armazenar os elementos. Cada elemento na lista é armazenado em um nó que contém uma referência para o próximo e o anterior.
Características: LinkedList permite inserções e remoções eficientes em qualquer posição da lista. No entanto, o acesso aos elementos por índice pode ser mais lento em comparação com ArrayList.
Exemplo: Uma LinkedList pode ser usada para implementar uma fila de espera em um sistema de atendimento ao cliente, onde os clientes podem ser adicionados no final da fila e atendidos sequencialmente.

4. HashMap:
Descrição: HashMap é uma implementação da interface Map que armazena pares chave-valor. Ele utiliza uma tabela de dispersão para armazenar os elementos, permitindo acesso rápido aos valores com base em suas chaves.
Características: HashMap oferece inserções, remoções e pesquisas rápidas de elementos. No entanto, não garante a ordem dos elementos e permite apenas uma chave nula e múltiplos valores nulos.
Exemplo: Um HashMap pode ser usado para armazenar um dicionário de palavras em um aplicativo de tradução, onde cada palavra é associada a sua tradução correspondente. Isso permite uma busca eficiente de uma palavra e sua tradução.
