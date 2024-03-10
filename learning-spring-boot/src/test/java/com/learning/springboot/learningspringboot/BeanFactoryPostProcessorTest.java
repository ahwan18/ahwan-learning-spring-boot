package com.learning.springboot.learningspringboot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.OrderedTest.TestConfiguration;
import com.learning.springboot.learningspringboot.data.Foo;
import com.learning.springboot.learningspringboot.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {

    @Component
    @Import({FooBeanFactoryPostProcessor.class})
    public static class TestConfiguration{
        
    }

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testRegistryBean() {
        Foo foo = applicationContext.getBean("foo", Foo.class);
        Assertions.assertNotNull(foo);
    }

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    
}
