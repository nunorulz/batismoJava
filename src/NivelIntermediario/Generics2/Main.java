package NivelIntermediario.Generics2;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do sapo"));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação da águia"));
        bolsaNinja.adicionarFerramenta(new CompanheiroAnimal("Mamaru"));

    }
}
