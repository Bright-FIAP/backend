package br.com.fiap.chefbotapi.service;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
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

    public Optional<Usuario> findByEmail (String email){
        return usuarioRepository.findByEmail(email);

    }

    public boolean usuarioExisteNoBanco(String email){
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
        return usuario.isPresent();
    }

    public boolean isUsuarioValido(String email, String senha){
        Optional<Usuario> usuario = usuarioRepository.findByEmail(email);
        if(usuario.isPresent()){
            return Objects.equals(usuario.get().getSenha(), senha);
        }else{
            return false;
        }
    }
}
