package NivelBasico.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * Switch Cases: Que servem para gerar casos específicos
        * Objetivo: Pedir pro usuário escolher entre os ninjas
        * Switchcases
        */

        // Pedir para o usuário
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuário escolher uma das opções
        int escolhaDoUsuario = sc.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        //Reacão ao escolher um personagem
        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu o Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou uma opção válida");
        }


        sc.close();

    }
}
