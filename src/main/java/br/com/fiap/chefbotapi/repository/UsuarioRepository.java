package br.com.fiap.chefbotapi.repository;

import br.com.fiap.chefbotapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
