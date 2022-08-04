package br.com.fiap.chefbotapi.repository;

import br.com.fiap.chefbotapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(
            value = "SELECT * FROM TB_USUARIO u WHERE u.st_usuario = 1",
            nativeQuery = true)
    List<Usuario> findAllActive();
}
