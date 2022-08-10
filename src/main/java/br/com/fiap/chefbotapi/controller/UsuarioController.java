package br.com.fiap.chefbotapi.controller;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.annotation.HttpConstraint;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.net.http.HttpResponse;
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

    @GetMapping(path = "/todosUsuarios")
    public List<Usuario> obterTodos(){
        return usuarioService.obterTodos();
    }

    @PostMapping(path = "/cadastrar")
    public void salvarUsuario(@RequestBody Usuario usuario){
        usuarioService.salvarUsuario(usuario);
    }

    @GetMapping(path = "/usuario/{id}")
    public ResponseEntity<Usuario> obterPorId(@PathVariable Long id){
        Optional<Usuario> usuario = usuarioService.obterPorId(id);
        if(usuario.isEmpty()){
            return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Usuario>(usuario.get(), HttpStatus.OK);
    }

    @PutMapping(path = "/remover/{id}")
    public Usuario delecaoLogica(@PathVariable long id){
        return usuarioService.delecaoLogica(id);
    }

    @DeleteMapping(path = "/deletar/{id}")
    public void deletar(@PathVariable Long id){
        usuarioService.deletar(id);
    }

    @GetMapping(path = "/listaUsuarios")
    public ResponseEntity<List<Usuario>> listagemLogica(){
        List<Usuario> usuarios = usuarioService.obterAtivos();
        return new ResponseEntity<>(usuarios, HttpStatus.CREATED);
    }

    @PostMapping(path = "/login")
    public ResponseEntity<Usuario> validaUsuario(@RequestBody Usuario usuario){
        Optional<Usuario> retornoDaQuery = usuarioService.login(usuario.getEmail(), usuario.getSenha());
        if(retornoDaQuery.isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "email ou senha incorretos");
        }else{
            System.out.println("Retornando aqui");
            Optional<Usuario> usuarioResponse = usuarioService.login(usuario.getEmail(), usuario.getSenha());
            return new ResponseEntity<Usuario>(usuarioResponse.get(), HttpStatus.OK);
        }
    }
}