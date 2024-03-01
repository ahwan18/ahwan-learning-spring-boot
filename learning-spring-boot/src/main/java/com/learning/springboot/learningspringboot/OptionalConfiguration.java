package com.learning.springboot.learningspringboot;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.learningspringboot.data.Bar;
import com.learning.springboot.learningspringboot.data.Foo;
import com.learning.springboot.learningspringboot.data.FooBar;

@Configuration
public class OptionalConfiguration {

    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar fooBar(Optional<Foo> foo, Optional<Bar> bar){
        return new FooBar(foo.orElse(null), bar.orElse(null));
    }
}
