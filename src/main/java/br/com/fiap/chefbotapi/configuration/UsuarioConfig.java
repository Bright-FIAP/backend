package br.com.fiap.chefbotapi.configuration;

import br.com.fiap.chefbotapi.model.Ingrediente;
import br.com.fiap.chefbotapi.model.Usuario;
import br.com.fiap.chefbotapi.repository.IngredienteRepository;
import br.com.fiap.chefbotapi.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UsuarioConfig {

    //TODO Apagar essa classe após todos os testes terem sido realizados

    @Bean
    CommandLineRunner commandLineRunner(UsuarioRepository usuarioRepository, IngredienteRepository ingredienteRepository) {
        return args -> {


//
//            Usuario u2 = new Usuario(
//                "André dos Santos Menezes de Souza",
//                "andremnzs@gmail.com",
//                "arrozcomfeijao",
//                "São Paulo"
//            );
//            Usuario u3 = new Usuario(
//                "Kaike de Santana Queiroz Ferreira",
//                "kaikequeiroz@gmail.com",
//                "658547585",
//                "São Paulo"
//            );
//            Usuario u4 = new Usuario(
//                    "Raissa Rassilan",
//                    "raissarassilan@gmail.com",
//                    "abecedee",
//                    "São Paulo"
//            );
//
            Ingrediente i1 = new Ingrediente(
                    "Alho",
                    "Tempero"
            );

            Usuario u1 = new Usuario(
                    "Giulio Cesar Costa Bernardi",
                    "giulioccbernardi@gmail.com",
                    "123456789",
                    "São Paulo",
                    List.of(i1)
            );

            Ingrediente i2 = new Ingrediente(
                    "Alho",
                    "Tempero"
            );

            u1.setIngredientes(List.of(i1, i2));
//
//            Ingrediente i2 = new Ingrediente(
//                    "Frango",
//                    "Carne",
//                    u1
//            );
//
//            Ingrediente i3 = new Ingrediente(
//                    "Açúcar",
//                    "Tempero",
//                    u1
//            );
//
//            Ingrediente i4 = new Ingrediente(
//                    "Arroz",
//                    "Mantimento",
//                    u1
//            );
//
//            Ingrediente i5 = new Ingrediente(
//                    "Feijão",
//                    "Mantimento",
//                    u2
//            );
//
//
            usuarioRepository.saveAll(List.of(u1));
//
            ingredienteRepository.saveAll(List.of(i1, i2));
            System.out.println(u1.getIngredientes().get(0).getNome());
        };

    }
}
