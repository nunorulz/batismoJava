package NivelIntermediario.ClassesAbastratas;

public abstract class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract void sabedoriaHokage();

    public Hokages() {

    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }
}
