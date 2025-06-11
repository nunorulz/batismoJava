package dev.projeto.CadastroDeNinjas.Ninjas;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }

    //Adicionar Ninja (Create)
    @PostMapping("/criar")
    public String criarNinja(){
        return "ninja criado";
    }

    //Mostrar todos os ninjas (Read)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar Ninja por ID (Read)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorID(id);
    }

    //Alterar dados dos Ninjas (Update)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }

    //Deletar Ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }
}

