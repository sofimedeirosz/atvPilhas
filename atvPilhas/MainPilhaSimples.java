package atvPilhas;

public class MainPilhaSimples {
    public static void main(String[] args) {

        PilhaSimples pilhaSimples = new PilhaSimples(6);
        pilhaSimples.empilhar("Ricardo");
        pilhaSimples.empilhar("Tania");
        pilhaSimples.empilhar("Marcelo");
        pilhaSimples.empilhar("Igor");
        pilhaSimples.empilhar("João");
        pilhaSimples.empilhar("Robson");
        pilhaSimples.empilhar("Bruna");
        pilhaSimples.exibirPilha();
        pilhaSimples.desempilhar();
        pilhaSimples.exibirPilha();
    }
}
