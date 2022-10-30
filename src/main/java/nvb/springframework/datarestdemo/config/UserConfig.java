package nvb.springframework.datarestdemo.config;

import lombok.AllArgsConstructor;
import nvb.springframework.datarestdemo.model.User;
import nvb.springframework.datarestdemo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
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
        };
    }

}
