package com.example.config;

import com.example.Domain.UserAccount;
import com.example.Domain.UserAccountRepository;
import com.example.Domain.UserRole;
import com.example.Domain.UserRolesRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example"})
@EntityScan("com.example")
@ComponentScan(basePackages = {"com.example"})
public class PostgresqlSecurityApplication {
    private static final Logger log = LoggerFactory.getLogger(PostgresqlSecurityApplication.class);

    @Autowired
    UserAccountRepository userAccountRepository;

    @Autowired
    UserRolesRepository userRolesRepository;

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlSecurityApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            log.info("Start initialization");
            userRolesRepository.save(new UserRole("ADMIN"));
            userRolesRepository.save(new UserRole("USER"));
            userAccountRepository.save(new UserAccount("Michael", "123"));
            userAccountRepository.save(new UserAccount("Sasha", "qaz"));
            List<UserRole> userRoles = new ArrayList<>();
            userRoles.add(userRolesRepository.findByUserRole("ADMIN").get(0));
            userAccountRepository.findByUserName("Michael").get(0).setUserRoles(userRoles);
            userRoles.clear();
            userRoles.add(userRolesRepository.findByUserRole("USER").get(0));
            userAccountRepository.findByUserName("Sasha").get(0).setUserRoles(userRoles);


//            log.info("Before " + userRepository.count());
//            List<Users> usersList = userRepository.findById(1L);
//            userRepository.delete(usersList.get(0));
//            log.info("After " + userRepository.count());

        };
    }


}
