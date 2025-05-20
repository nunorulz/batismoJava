package NivelIntermediario.DesafioUm;

public class Uchiha extends Ninja{

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("Nível de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status da missão: " + statusDaMissao);
        System.out.println("Missão: " + missao);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade especial Uchiha");
    }
}
