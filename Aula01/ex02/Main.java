// Utilizando um array estático de dez posições, desenvolva um algoritmo com as seguintes funcionalidades:
//  Cadastrar;
// Listar todos os nomes;
//  Alterar;
//  Remover;
//  Finalizar.
//Essa estrutura ficará em um laço de repetição.

package ex02;

class NameRegistry {
    private static int MAX_NOMES = 10;
    private String[] names = new String[MAX_NOMES];
    private int numNames;

    public NameRegistry() {
        numNames = 0;
    }

    public void cadastrar(String name) {
        if (numNames < MAX_NOMES) {
            names[numNames++] = name;
        } else {
            System.out.println("Registry is full.");
        }
    }

    public void listarTodosOsNomes() {
        for (int i = 0; i < numNames; i++) {
            System.out.println(names[i]);
        }
    }

    public boolean alterar(int index, String newName) {
        if (index >= 0 && index < numNames) {
            names[index] = newName;
            return true;
        } else {
            return false;
        }
    }

    public boolean remover(String name) {
        for (int i = 0; i < numNames; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < numNames - 1; j++) {
                names[j] = names[j+1];
                }
                numNames--;
                return true;
            }
        }
        return false;
    }
}
