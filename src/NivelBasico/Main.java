package NivelBasico;

public class Main {
    public static void main(String[] args) {

        //Criar o ninja Naruto;
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();


        //Criar ninja Sasuke Uchiha
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Konoha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Konoha";
        Sakura.idade = 16;
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Konoha";
        Hinata.idade = 16;
        Hinata.ByakuganAtivado();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto Hyuga Uzumaki";
        Boruto.aldeia = "Konoha";
        Boruto.idade = 9;
        Boruto.ModoSabioAtivado();
        Boruto.AtivarKarma();
        Boruto.AtivarJougan();

    }
}
