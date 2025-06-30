package dev.projeto.CadastroDeNinjas.Ninjas;

import dev.projeto.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String img_url;
    private int idade;
    private String rank;
    private MissoesModel missoes;
}
