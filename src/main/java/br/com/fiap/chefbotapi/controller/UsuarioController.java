package br.com.fiap.chefbotapi.controller;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @GetMapping(path = "/usuarios")
    public List<Usuario> obterTodos(){
        return usuarioService.obterTodos();
    }

    @PostMapping(path = "/cadastrar")
    public void salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
    }

    @GetMapping(path = "usuario/{id}")
    public Optional<Usuario> obterPorId(@PathVariable Long id){
        return usuarioService.obterPorId(id);
    }
}
