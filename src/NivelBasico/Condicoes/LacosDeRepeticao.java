package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        * Laços de repetição
        * while / for
        */

        //While
        //While (condicao){
        // tudo aqui vai acontecer
        // }

        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        /*while (numeroDeClones <= numeroMaxDeClones){
            numeroDeClones ++;
            System.out.println("O naruto um clone das sombras " + numeroDeClones);
        }*/

        //For

        for (int i = 0; i <= numeroMaxDeClones ; i++){
        System.out.println("O Naruto já se clonou " + i + "x" );

        }
    }
}
