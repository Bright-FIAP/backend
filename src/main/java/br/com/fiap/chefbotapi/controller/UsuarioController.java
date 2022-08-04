package br.com.fiap.chefbotapi.controller;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    @PostMapping(path = "/cadastrar")
    public void salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
    }
}
