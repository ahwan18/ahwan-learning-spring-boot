package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.data.Connection;

public class LifeCycleTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testName() {
        Connection connection = applicationContext.getBean(Connection.class);
        applicationContext.registerShutdownHook();
    }

    

    @AfterEach
    void tearDown() {
        // applicationContext.close();
    }



    @BeforeEach
    void setUp() {
     applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
    }

    
}
