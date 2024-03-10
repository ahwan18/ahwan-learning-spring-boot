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
import com.learning.springboot.learningspringboot.processor.PrefixIdGeneratorBeanPostProcessor;

public class OrderedTest {

    @Configuration
    @Import({Car.class, IdGeneratorBeanPostProcessor.class, PrefixIdGeneratorBeanPostProcessor.class})
    public static class TestConfiguration{
    }

        private ConfigurableApplicationContext applicationContext;

        @Test
        void testCar() {
            Car car = applicationContext.getBean(Car.class);

            Assertions.assertNotNull(car.getId());
            Assertions.assertTrue(car.getId().startsWith("AHW-"));
            System.out.println(car.getId());
        }

        @BeforeEach
        void setUp() {
            applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
            applicationContext.registerShutdownHook();
        }

}
