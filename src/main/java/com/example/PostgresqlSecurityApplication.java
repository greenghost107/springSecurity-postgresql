package com.example;

import com.example.Data.Users;
import com.example.Data.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example"})
public class PostgresqlSecurityApplication {
    private static final Logger log = LoggerFactory.getLogger(PostgresqlSecurityApplication.class);

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlSecurityApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            log.info("Start initialization");
           userRepository.save(new Users("Michael","123"));
            userRepository.save(new Users("Sasha", "qaz"));
            userRepository.save(new Users("Newton", "111"));
//            log.info("Before " + userRepository.count());
//            List<Users> usersList = userRepository.findById(1L);
//            userRepository.delete(usersList.get(0));
//            log.info("After " + userRepository.count());

        };
    }


}
