package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioService {


    private UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarUsuario(Usuario usuario){
        System.out.println(usuario);
        usuarioRepository.save(usuario);
    }

}
