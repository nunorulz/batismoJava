package NivelIntermediario.ListArray;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Array - São estáticos, não alteram de tamanho
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";

        //Listas são dinamicas

        List <String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakashi Hatake");
        System.out.println(ninjasList);

        ninjasList.remove("Kakashi Hatake");

        System.out.println(ninjasList);

        ninjasList.set(3, "Hashirama Senju");

        System.out.println(ninjasList);

        System.out.println(ninjasList.size());
        


    }
}
