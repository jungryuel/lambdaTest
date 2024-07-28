package com.example.lambdatest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class FunctionConfiguration {

    @Bean
    public Function<String, String> hello() {
        return (input) -> "Hello, " + input;
    }
}
