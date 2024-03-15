package com.learning.springboot.learningspringboot.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.springboot.learningspringboot.application.FooApplication;
import com.learning.springboot.learningspringboot.data.Foo;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {

    @Autowired
    Foo foo;

    @Test
    void testSpringTest() {
        Assertions.assertNotNull(foo);
    }

    

}
