package dev.projeto.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

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
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninja";
    }

    //Mostrar Ninja por ID (Read)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar ninja por ID";
    }

    //Alterar dados dos Ninjas (Update)
    @PutMapping("/alterar")
    public String alterarNinjaPorId(){
        return "Alterar ninja por ID";
    }

    //Deletar Ninja (Delete)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por ID";
    }
}

