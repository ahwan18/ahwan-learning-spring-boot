package com.learning.springboot.learningspringboot;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.springboot.learningspringboot.data.Foo;

public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @Test
    void testBeanFactory() {
        ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> fooList = fooObjectProvider.stream().collect(Collectors.toList());

        System.out.println(fooList);

        Map<String,Foo> beans = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beans);
    }

    @BeforeEach
    void setUp() {
     applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
     applicationContext.registerShutdownHook(); 
    }

    
}
