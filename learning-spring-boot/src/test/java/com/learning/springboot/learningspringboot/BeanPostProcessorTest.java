package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.springboot.learningspringboot.data.Car;
import com.learning.springboot.learningspringboot.processor.IdGeneratorBeanPostProcessor;

public class BeanPostProcessorTest {

    private ConfigurableApplicationContext applicationContext;

    @Configuration
    @Import({Car.class, IdGeneratorBeanPostProcessor.class})
    public static class TestConfiguration {
    }

    @Test
    void testIdGenerator() {
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car.getId());
        Assertions.assertNotNull(car.getId());
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    
}
