package NivelBasico.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {

        /*
         * Scanner: É o jeito de trazer o usuário para dentro da aplicação
         * Objetivo: O usuário vai criar um ninja e vamos validar os dados
         */

        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);


        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNija = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNija);

        if(idadeDoNija >= 18) {
            System.out.println("Esse ninja já pode ir para missões fora da aldeia");
        }else{
            System.out.println("Esse ninha ainda precisa treinar mais");
        }

        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }
}
