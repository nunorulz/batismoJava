package dev.projeto.CadastroDeNinjas.Ninjas;
import java.util.List;
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
}
