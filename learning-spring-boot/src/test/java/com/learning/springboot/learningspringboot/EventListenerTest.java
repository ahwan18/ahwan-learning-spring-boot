package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.springboot.learningspringboot.listener.LoginSuccesListener;
import com.learning.springboot.learningspringboot.listener.LoginSuccessAgainListener;
import com.learning.springboot.learningspringboot.listener.UserListener;
import com.learning.springboot.learningspringboot.service.UserService;

public class EventListenerTest {

    @Configuration
    @Import({
        LoginSuccesListener.class, UserService.class, LoginSuccessAgainListener.class, UserListener.class
    })
    public static class TestConfiguration {
        
    }

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testListener() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("ahmad", "kurniawan");
        userService.login("ahmad", "salah");
        userService.login("kurniawan", "salah");
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    
}
