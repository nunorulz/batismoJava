package NivelIntermediario.DesafioNinja;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("Lista de Ninjas: " + listaDeNinjas);

        listaDeNinjas.addFirst(new Ninja("Boruto", 9, "Konoha"));
        System.out.println("Lista de Ninjas: " + listaDeNinjas);
        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido " + removido);

        System.out.println("Lista de Ninjas: " + listaDeNinjas);


        System.out.println("----------------- Mudanças -----------------");

        for (Ninja listaDeNinjaAtualizada : listaDeNinjas){
            System.out.println("Lista atualizada" + listaDeNinjaAtualizada);
        }

    }
}
