package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "com.learning.springboot.learningspringboot.service",
    "com.learning.springboot.learningspringboot.repository"
})
public class ComponentConfiguration {

}
