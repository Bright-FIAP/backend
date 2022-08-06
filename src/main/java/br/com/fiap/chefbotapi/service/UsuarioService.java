package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

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

    public Optional<Usuario> obterPorId(Long id){
        return usuarioRepository.findById(id);
    }

    public Usuario delecaoLogica(long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        usuario.get().setStatus(false);
        return usuarioRepository.save(usuario.get());
    }

    public List<Usuario> obterAtivos(){
        return usuarioRepository.findAllActive();
    }
}
