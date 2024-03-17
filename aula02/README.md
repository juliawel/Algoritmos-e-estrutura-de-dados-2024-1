1. Citar os quatro tipos de armazenamentos (Vector, ArrayList, LinkedList e HashMap). 
Vector
ArrayList
LinkedList
HashMap

2. Faça um breve resumo de cada um.
Vector: Uma implementação de lista que é sincronizada e, portanto, é thread-safe. É menos eficiente que as implementações modernas de lista devido à sincronização.
ArrayList: Implementa a interface List e usa um array dinâmico para armazenar elementos. É mais eficiente em termos de desempenho do que o Vector e não é thread-safe.
LinkedList: Implementa a interface List e utiliza uma estrutura de lista duplamente encadeada. Oferece operações eficientes de adição/remoção de elementos, mas pode ser menos eficiente em termos de acesso direto aos elementos.
HashMap: Implementa a interface Map e armazena pares chave-valor. Oferece acesso rápido aos elementos por meio de uma tabela hash. É eficiente para operações de busca, inserção e remoção.

3. Descreva as características.
Vector: Sincronizado, menos eficiente que ArrayList.
ArrayList: Não sincronizado, eficiente em termos de acesso direto e manipulação de elementos.
LinkedList: Estrutura de lista duplamente encadeada, eficiente em adições/remoções, menos eficiente em acessos diretos.
HashMap: Armazena pares chave-valor, acesso rápido por meio de uma tabela hash.

4. Exemplifique cada um (o exemplo não precisa ser código, apenas um texto).
Vector: Usado em casos onde a sincronização é essencial, como em ambientes multi-thread.
ArrayList: Útil quando se precisa de acesso rápido e frequente aos elementos, sem se preocupar com sincronização.
LinkedList: Adequado para cenários em que há muitas operações de inserção e remoção, e o acesso direto aos elementos é menos frequente.
HashMap: Útil para armazenar dados na forma de pares chave-valor, como em bancos de dados de memória ou caches. Exemplo: armazenar dados de um sistema de login, onde as chaves são os nomes de usuário e os valores são as informações do usuário.




