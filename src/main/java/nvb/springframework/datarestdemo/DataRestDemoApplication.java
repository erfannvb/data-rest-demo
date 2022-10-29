package nvb.springframework.datarestdemo;

import lombok.AllArgsConstructor;
import nvb.springframework.datarestdemo.model.User;
import nvb.springframework.datarestdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class DataRestDemoApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(DataRestDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

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

    }
}
