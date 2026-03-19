public class MainPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Gabriel");
        pilhaDinamica.empilhar("Duda");
        pilhaDinamica.empilhar("Sofia");
        pilhaDinamica.empilhar("João");
        pilhaDinamica.empilhar("Henrique");
        pilhaDinamica.empilhar("Gustavo");
        pilhaDinamica.exibirPilha();
        pilhaDinamica.desempilhar();
        pilhaDinamica.exibirPilha();
    }
}