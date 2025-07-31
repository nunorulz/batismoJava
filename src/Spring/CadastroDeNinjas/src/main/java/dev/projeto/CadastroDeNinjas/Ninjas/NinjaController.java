package dev.projeto.CadastroDeNinjas.Ninjas;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem";
    }

    //Adicionar Ninja (Create)
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja){
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome() + " (ID): " + novoNinja.getId());
    }

    //Mostrar todos os ninjas (Read)
    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> listarNinjas(){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    //Mostrar Ninja por ID (Read)
    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id){

        NinjaDTO ninja = ninjaService.listarNinjasPorID(id);

        if (ninja !=null){
            return ResponseEntity.ok("Ninja encontrado " + ninja.getNome());
        } else {
            return  ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com id: " + id + " não existe em nossos registros");
        }
    }

    //Alterar dados dos Ninjas (Update)
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        NinjaDTO ninja =  ninjaService.atualizarNinja(id, ninjaAtualizado);

        if(ninja != null){
            return ResponseEntity.ok(ninja);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com id: " + id + " não encontrado");
        }
    }

    //Deletar Ninja (Delete)
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorId(@PathVariable Long id){
        if(ninjaService.listarNinjasPorID(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " deletado com sucesso");
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o id " + id + " não encontrado");
        }
    }
}

