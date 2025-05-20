package NivelIntermediario.Generics;

import java.util.List;
import java.util.ArrayList;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
        this.equipamentos = new ArrayList<>() ;
    }

    //Colocar equipamentos dentro da bolsa
    public void adicionarEquipamentos( T equipamentoGenerico ){
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos(){
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString(){
        return "Bolsa de equipamentos: " + equipamentos.toString();
    }
}
