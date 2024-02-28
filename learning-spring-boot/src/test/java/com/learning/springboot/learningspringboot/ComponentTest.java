package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.service.ProductService;

public class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testComponent() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);

        Assertions.assertNotSame(productService1, productService2);
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    
}
