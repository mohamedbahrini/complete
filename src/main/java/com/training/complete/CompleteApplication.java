package com.training.complete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableAspectJAutoProxy
@PropertySource("classpath:config.properties")
public class CompleteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompleteApplication.class, args);
    }

}
