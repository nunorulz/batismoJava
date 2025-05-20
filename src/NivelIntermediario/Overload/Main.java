package NivelIntermediario.Overload;

public class Main {
    public static void main(String[] args) {

        // Obj ninja nao da pra ser criado por que é abstrato

        // Obj uzumaki
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 16, 20, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();
        System.out.println("____________________");
        naruto.tacarKunai();
        System.out.println("____________________");
        System.out.println(naruto.altura);

        // Obj uchiha
        Uchiha sasuke = new Uchiha("Sasuke uchiha", "Aldeia da folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        // Obj Uchiha 2®
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da folha", 27 );
        itachi.habilidadeEspecial();

        // obj Uchiha 3
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha", 45,900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(200);
    }
}
