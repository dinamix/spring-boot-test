package com.tano.controller;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.ejb.access.LocalStatelessSessionProxyFactoryBean;

import com.tano.dao.UserDao;
import com.tano.dao.impl.UserDaoImpl;
import com.tano.logic.UserLogic;

/**
 * Created by dinamix on 9/15/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.tano" })
public class App {
    
	@Bean
    public UserLogic createUserLogic() {
        return new UserLogic();
    }
	
//	@Bean
//	public UserDao createDao() {
//		return new UserDaoImpl();
//	}
	
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(App.class, args);
    }
}
