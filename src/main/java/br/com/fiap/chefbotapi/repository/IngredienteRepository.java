package br.com.fiap.chefbotapi.repository;

import br.com.fiap.chefbotapi.model.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
