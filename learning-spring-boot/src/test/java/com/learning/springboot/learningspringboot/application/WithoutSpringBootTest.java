package com.learning.springboot.learningspringboot.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.data.Foo;

public class WithoutSpringBootTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testWithoutSpringBoot() {
        Foo foo = applicationContext.getBean(Foo.class);
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    
}
