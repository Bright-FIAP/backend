package br.com.fiap.chefbotapi.configuration;

import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository) {
        return args -> {


//             Usuario u1 = new Usuario(
//                     "Giulio Cesar Costa Bernardi",
//                     "giulioccbernardi@gmail.com",
//                     "123456789",
//                     "São Paulo"
//             );


//             usuarioRepository.saveAll(List.of(u1));

        };

    }
}
