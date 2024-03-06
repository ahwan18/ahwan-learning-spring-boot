package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.service.MerchantService;
import com.learning.springboot.learningspringboot.service.MerchantServiceImpl;

public class InheritanceTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testInheritance() {
        MerchantService merchantService = applicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, merchantServiceImpl);
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    
}
