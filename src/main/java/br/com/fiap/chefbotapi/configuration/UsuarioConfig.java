package br.com.fiap.chefbotapi.configuration;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {

    //TODO Apagar essa classe após todos os testes terem sido realizados

    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository repository) {
        return args -> {
            Usuario u1 = new Usuario(
                "Giulio Cesar Costa Bernardi",
                "giulioccbernardi@gmail.com",
                "123456789",
                "São Paulo"
            );
            Usuario u2 = new Usuario(
                "André dos Santos Menezes de Souza",
                "andremnzs@gmail.com",
                "arrozcomfeijao",
                "São Paulo"
            );
            Usuario u3 = new Usuario(
                "Kaike de Santana Queiroz Ferreira",
                "kaikequeiroz@gmail.com",
                "658547585",
                "São Paulo"
            );
            Usuario u4 = new Usuario(
                    "Raissa Rassilan",
                    "raissarassilan@gmail.com",
                    "abecedee",
                    "São Paulo"
            );

            repository.saveAll(List.of(u1, u2, u3, u4));

        };

    }
}
