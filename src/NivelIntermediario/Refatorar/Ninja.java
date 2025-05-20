package NivelIntermediario.Refatorar;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 atributos: numeroDeMissoesConcluidas , Rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 210;

    public Ninja() {
    }

    final void tacarKunai(){
        System.out.println("Eu sou um metodo da classe MAE");
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: Sobrecarga do construtor chamado os novos atributos
    // Sobrecarga de metodos voce nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }


    // Metodos geral! Todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    // Sobreescrevendo o metodo da interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println( "Meu nome é: " + nome + " Essa é minha estrategia de combate");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e esse é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {

        if (qi > 150){
            System.out.println("Seu QI é: " + qi + " e você é um gênio");
        } else if (qi >= 130){
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor!");
        }else{
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estratégias");
        }
    }

    public void metodoProvisorio(){

    }
}
