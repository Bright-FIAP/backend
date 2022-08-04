package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

    public List<Usuario> obterTodos(){
        return usuarioRepository.findAll();
    }

}
