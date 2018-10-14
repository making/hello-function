package com.example.hellofunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableBinding(Processor.class)
public class HelloFunctionApplication {

    @Bean
    public Function<String, String> hello() {
        return s -> "Hello " + s + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloFunctionApplication.class, args);
    }
}
