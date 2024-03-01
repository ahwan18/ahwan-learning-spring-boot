package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.springboot.learningspringboot.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "com.learning.springboot.learningspringboot.service",
    "com.learning.springboot.learningspringboot.repository",
    "com.learning.springboot.learningspringboot.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {

}
