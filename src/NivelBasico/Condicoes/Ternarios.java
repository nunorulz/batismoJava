package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        *Ternários - Serve para reduzir codigos
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        */


        short numerosDeMissoes = 11;

        String nivelDoNinja = (numerosDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja está com menos de 10 missões";
        System.out.println(nivelDoNinja);

    }
}
