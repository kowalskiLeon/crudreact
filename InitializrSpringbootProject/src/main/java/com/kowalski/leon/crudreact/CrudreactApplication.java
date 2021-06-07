package com.kowalski.leon.crudreact;

import java.util.Date;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("repositorios") 
@EntityScan("entidades")
public class CrudreactApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudreactApplication.class, args);
    }

    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Maceio"));
        System.out.println("Date in America/Maceio: " + new Date().toString());
    }
}
