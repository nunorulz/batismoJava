package NivelIntermediario.HerancaMultiplas;

public class Main {
    public static void main(String[] args) {

        //Obj uchiha
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Konoha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Konoha";
        kakashi.idade = 25;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
    }
}
