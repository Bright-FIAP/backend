package br.com.fiap.chefbotapi.repository;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(
            value = "SELECT * FROM TB_USUARIO u WHERE u.st_usuario = 1",
            nativeQuery = true)
    List<Usuario> findAllActive();

    @Query(
            value = "SELECT * FROM TB_USUARIO u WHERE u.ds_email = :email", nativeQuery = true)
    Optional<Usuario> findByEmail(@Param("email") String email);
}
