package nvb.springframework.datarestdemo;

import nvb.springframework.datarestdemo.model.User;
import nvb.springframework.datarestdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataRestDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DataRestDemoApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

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
