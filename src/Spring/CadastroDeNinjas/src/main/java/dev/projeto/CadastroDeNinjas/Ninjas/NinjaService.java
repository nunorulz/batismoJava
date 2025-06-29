package dev.projeto.CadastroDeNinjas.Ninjas;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os meu ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    //Listar todos os ninjas por ID
    public NinjaModel listarNinjasPorID(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //Criar um novo ninja
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    //Deletar o ninja
    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }

    //Atualizar um ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
