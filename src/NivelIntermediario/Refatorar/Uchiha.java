package NivelIntermediario.Refatorar;

public class Uchiha extends Ninja implements SharinganInterface {

    //Construtor vazio
    public Uchiha(){
        super();
    }

    //Construtor
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);
    }

    //Construtor
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    public void sharinganAtivado(){
        System.out.println(nome + ": Ativou o Sharingan!");
    }

}
