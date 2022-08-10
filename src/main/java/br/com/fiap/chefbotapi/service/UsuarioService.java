package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
        usuario.setStatus(true);
        usuario.setDataCadastro(LocalDateTime.now());
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

    public void deletar(Long id){
        usuarioRepository.deleteById(id);
    }

    public List<Usuario> obterAtivos(){
        return usuarioRepository.findAllActive();
    }

    public Optional<Usuario> login (String email, String senha){

//        System.out.println("Aqui é do email: " + usuarioRepository.findByEmail(email, senha).get().getEmail());
        return usuarioRepository.findByEmail(email, senha);

    }
}
