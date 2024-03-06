package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.client.PaymentGatewayClient;

public class FactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testFactoryBean() {
        PaymentGatewayClient client = applicationContext.getBean(PaymentGatewayClient.class);
        Assertions.assertEquals("https://example.com", client.getEndpoint());
        Assertions.assertEquals("public", client.getPublicKey());
        Assertions.assertEquals("private", client.getPrivateKey());
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        applicationContext.registerShutdownHook();
    }

}
