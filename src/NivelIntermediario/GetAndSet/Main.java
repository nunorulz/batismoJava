package NivelIntermediario.GetAndSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("__________ Naruto Uzumaki __________");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 17, 20, 1.67);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto");
        System.out.println("Meu nome é: " + naruto.getNome());

        System.out.println("__________ Sasuke Uchiha __________");
    }
}
