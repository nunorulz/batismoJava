package NivelIntermediario.Generics2;

public class CompanheiroAnimal {

    private String nome;

    public CompanheiroAnimal(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Este é meu companheiro ninja: " + nome;
    }
}
