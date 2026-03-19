public class PilhaDinamica {
    No inicio;

    public PilhaDinamica() {
        this.inicio = new No(null);
    }

    public boolean estaVazio() {
        if (inicio.getConteudo() == null) {
            return true;
        }
        return false;
    }

    public void exibirPilha() {
        if(!estaVazio()) {
            No aux = this.inicio;
            while(aux.getProx() != null) {
                System.out.println(aux.getConteudo());
                aux = aux.getProx();
            }
            System.out.println(aux.getConteudo());
        } else {
            System.out.println("Não existem elementos na Lista Dinâmica.");
        }
    }

    public void empilhar(String conteudo) {
        if (estaVazio()) {
            System.out.println("Elemento "+conteudo+" adicionado com sucesso.");
            inicio.setConteudo(conteudo);
        }else {
            No aux = inicio;
            while (aux.getProx() != null) {
                aux = aux.getProx();
            }
            System.out.println("Elemento "+conteudo+" adicionado com sucesso.");
            aux.setProx(new No(conteudo));
        }
    }

    public void desempilhar() {
        if (!estaVazio()) {
            No aux = inicio;
            if(inicio.getProx() == null) {
                System.out.printf("Elemento %s removido com sucesso\n", inicio.getConteudo());
                inicio.setConteudo(null);
            }else{
                while(aux.getProx().getProx() != null) {
                    aux = aux.getProx();
                }
                System.out.printf("Elemento %s removido com sucesso\n", aux.getProx().getConteudo());
                aux.setProx(null);
            }
        }else {
            System.out.println("A pilha está vazia.");
        }
    }

}