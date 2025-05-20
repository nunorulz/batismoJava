package NivelBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {
        /*
        * if (condicao) { resultado }
        * else if (condicao) { resultado }
        * else { resultado }
         */

        //Ninja naruto
        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se (condição) {faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        }else if(numeroDeMissoes >= 20){
            System.out.print("Rank: Jounin");
        }else {
            System.out.println("Rank: Gennim");
        }
    }
}
