package controller;

import logic.UserLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dinamix on 9/15/16.
 */
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class App {
    @Bean
    public UserLogic createUserLogic() {
        return new UserLogic();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
    }
}
