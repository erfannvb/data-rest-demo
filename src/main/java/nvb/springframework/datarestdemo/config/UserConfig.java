package nvb.springframework.datarestdemo.config;

import nvb.springframework.datarestdemo.model.User;
import nvb.springframework.datarestdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return args -> {
            User john = User.builder()
                    .firstName("John")
                    .lastName("Doe")
                    .email("john.doe@gmail.com")
                    .build();

            userRepository.save(john);

            User jessica = User.builder()
                    .firstName("Jessica")
                    .lastName("Watson")
                    .email("jess@gmail.com")
                    .build();

            userRepository.save(jessica);

            User dylan = User.builder()
                    .firstName("Dylan")
                    .lastName("Smith")
                    .email("dylan.smith@gmail.com")
                    .build();

            userRepository.save(dylan);

            User robert = User.builder()
                    .firstName("Robert")
                    .lastName("Clark")
                    .email("rc@gmail.com")
                    .build();

            userRepository.save(robert);

            User kevin = User.builder()
                    .firstName("Kevin")
                    .lastName("Collins")
                    .email("k.collins@gmail.com")
                    .build();

            userRepository.save(kevin);

            User ava = User.builder()
                    .firstName("Ava")
                    .lastName("O'Connor")
                    .email("ava.conner@gmail.com")
                    .build();

            userRepository.save(ava);

            User emma = User.builder()
                    .firstName("Emma")
                    .lastName("Davis")
                    .email("davis.emma@gmail.com")
                    .build();

            userRepository.save(emma);

            User thomas = User.builder()
                    .firstName("Thomas")
                    .lastName("Anderson")
                    .email("th.anderson@gmail.com")
                    .build();

            userRepository.save(thomas);
        };
    }

}
