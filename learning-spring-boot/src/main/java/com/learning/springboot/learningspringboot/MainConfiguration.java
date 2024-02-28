package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.springboot.learningspringboot.configuration.BarConfiguration;
import com.learning.springboot.learningspringboot.configuration.FooConfiguration;
import com.learning.springboot.learningspringboot.data.Bar;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {

}
