package br.com.fiap.chefbotapi.repository;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {


    @Query(
            value = "SELECT * FROM TB_INGREDIENTE i WHERE i.usuario_id = ?",
            nativeQuery = true)
    List<Ingrediente> obterIngredientesDeUmUsuario(Long id);


}
