package NivelBasico.DesafioUm;

public class NinjasKonoha {
    public static void main(String[] args) {

        //Ninja 1
        String nomeNinjaUm = "Ninja Um";
        String missaoNinjaUm = "Missão Ninja Um";
        int idadeNinjaUm = 16;
        char nivelMissaoNinjaUm = 'B';
        String statusMissaoNinjaUm = "Em andamento";

        //Verificar nivel de missão do ninja
        if(idadeNinjaUm < 15){
            if(nivelMissaoNinjaUm == 'C' || nivelMissaoNinjaUm == 'D'){
                statusMissaoNinjaUm = "Concluída";
            }else {
                statusMissaoNinjaUm = "Não concluída, idade insuficiente";
            }
        }else{
            statusMissaoNinjaUm = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinjaUm);
        System.out.println("Idade do ninja um: " + idadeNinjaUm);
        System.out.println("Missão do ninja um: " + missaoNinjaUm);
        System.out.println("statusMissaoNinjaUm = " + statusMissaoNinjaUm);

        //Ninja 2
        String nomeNinjaDois = "Ninja Dois";
        String missaoNinjaDois = "Missão Ninja Um";
        int idadeNinjaDois = 16;
        int nivelMissaoNinjaDois = 'B';
        boolean statusMissaoNinjaDois = false;

        //Ninja 3
        String nomeNinjaTres = "Ninja Tres";
        String missaoNinjaTres = "Missão Ninja Um";
        int idadeNinjaTres = 16;
        char nivelMissaoNinjaTres = 'A';
        boolean statusMissaoNinjaTres = false;


    }
}
