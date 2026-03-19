public class PilhaSimples {
    String[] pilha;

    public PilhaSimples(int tamanho) {
        this.pilha = new String[tamanho];
    }

    private boolean estaCheia() {
        for (int i = 0; i < pilha.length; i++) {
            if (pilha[i] == null) {
                return false;
            }
        }
        return true;
    }

    private boolean estaVazia() {
        if (pilha[0] == null) {
            return true;
        }
        return false;
    }

    public void exibirPilha() {
        for (int i = pilha.length - 1; i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }

    public void empilhar(String elemento) {
        if (!estaCheia()) {
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] == null) {
                    System.out.println("Elemento"+elemento+"adicionado com sucesso!");
                    pilha[i] = elemento;
                    return;
                }
            }
        }else {
            System.out.println("A pilha está cheia.");
        }
    }

    public void desempilhar() {
        if (!estaVazia()) {
            for (int i = pilha.length-1; i >= 0; i--) {
                if (pilha[i] != null) {
                    System.out.println("Elemento "+pilha[i]+" removido com sucesso!");
                    pilha[i] = null;
                    return;
                }
            }
        }else {
            System.out.println("A pilha está vazia.");
        }
    }
}
