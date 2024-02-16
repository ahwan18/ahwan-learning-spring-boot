package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learning.springboot.learningspringboot.data.Foo;

@Configuration
public class PrimaryConfiguration {

    @Primary
    @Bean
    public Foo foo1(){
        return new Foo();
    }
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }
}
