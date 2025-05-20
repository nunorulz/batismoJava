package NivelIntermediario.Generics2;

import java.util.List;

public class BolsaNinja<T> {

    //Inicializar o array

    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = ferramentas;
    }

    //colocar ferramenta no array

    public void adicionarFerramenta(T ferramenta){
        ferramentas.add(ferramenta);
    }

    //mostrar a nossa lista de ferramenta
    public void mostrarFerramenta(){
        for (T ferramenta : ferramentas){
            System.out.println(ferramentas);
        }
    }

}
