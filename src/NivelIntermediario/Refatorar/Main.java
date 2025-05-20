package NivelIntermediario.Refatorar;

public class Main {
    public static void main(String[] args) {
        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        System.out.println("____________________ Naruto Uzumaki ____________________");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 16, 20, NivelNinja.GENIN, Biju.KYUUBI);
        naruto.habilidadeEspecial();
        System.out.println(naruto.biju);

        // Obj uchiha
        System.out.println("____________________ Sasuke uchiha ____________________");
        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2®
        System.out.println("____________________ Itachi Uchiha ____________________");
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27, 30, NivelNinja.JOUNIN );
        itachi.habilidadeEspecial();

        // obj Uchiha 3
        System.out.println("____________________ Madara Uchiha ____________________");
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
    }
}
