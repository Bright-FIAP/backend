package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.repository.IngredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredienteService {

    private IngredienteRepository ingredienteRepository;

    @Autowired
    public IngredienteService(IngredienteRepository ingredienteRepository){
        this.ingredienteRepository = ingredienteRepository;
    }

    public void salvarIngrediente(Ingrediente ingrediente){
        ingredienteRepository.save(ingrediente);
    }

    public List<Ingrediente> obterTodos(){
        return ingredienteRepository.findAll();
    }

    public Optional<Ingrediente> obterPorId(Long id){
        return ingredienteRepository.findById(id);
    }

    public void removerIngrediente(Long id){
        ingredienteRepository.deleteById(id);
    }

}
