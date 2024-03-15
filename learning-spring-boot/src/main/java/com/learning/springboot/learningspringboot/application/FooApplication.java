package com.learning.springboot.learningspringboot.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.learning.springboot.learningspringboot.data.Foo;

@SpringBootApplication
public class FooApplication {

    @Bean
    public Foo foo(){
        return new Foo();
    }
}
