package bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dinamix on 9/15/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.tano" })
public class App {
    
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
    }
}
