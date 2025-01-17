package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.learning.springboot.learningspringboot.data.Foo;

@Configuration
public class BeanNameConfiguration {

    @Primary
    @Bean(value = "fooFirst")
    public Foo foo1(){
        return new Foo();
    }

    @Bean(value = "fooSecond")
    public Foo foo2(){
        return new Foo();
    }
}
