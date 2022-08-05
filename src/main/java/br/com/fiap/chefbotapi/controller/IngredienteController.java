package br.com.fiap.chefbotapi.controller;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.service.IngredienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/ingrediente")
public class IngredienteController {

    private final IngredienteService ingredienteService;

    @Autowired
    public IngredienteController(IngredienteService ingredienteService){
        this.ingredienteService = ingredienteService;
    }

    @GetMapping(path = "/ingredientes")
    public List<Ingrediente> obterTodos(){
        return ingredienteService.obterTodos();
    }

    @PostMapping(path = "/cadastrar")
    public void salvarIngrediente(@RequestBody Ingrediente ingrediente){
        ingredienteService.salvarIngrediente(ingrediente);
    }

    @GetMapping(path = "/ingrediente/{id}")
    public Optional<Ingrediente> obterPorId(@PathVariable Long id){
        return ingredienteService.obterPorId(id);
    }

    @DeleteMapping(path = "remover/{id}")
    public void removerIngrediente(Long id){
        ingredienteService.removerIngrediente(id);
    }

}
