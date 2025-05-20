package NivelIntermediario.DesafioUm;

public class Ninja {

    String nome;
    String nivelDeDificuldade;
    String missao;
    String statusDaMissao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Nível de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Missão: " + missao);
        System.out.println("Idade: " + idade);
    }

}
