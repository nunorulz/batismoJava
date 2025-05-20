package NivelIntermediario.HerancaMultiplas;

public class Hatake extends Ninja implements ShariganInterface, AmbuInterface{

    public void boasVindas(){
        System.out.println("Eu sou um Hatake!");
    }

    public void sharinganAtivado(){
        System.out.println("Meu nome é "+nome+" meu saringan está ativado!");
    }

    public void ninjaDeElite(){
        System.out.println("Meu nome é " + nome + " eu sou um ninja de elite da AMBU!");
    }

}
