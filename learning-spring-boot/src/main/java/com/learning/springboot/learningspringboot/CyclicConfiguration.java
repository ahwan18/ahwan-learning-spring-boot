package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.learningspringboot.data.cyclic.CyclicA;
import com.learning.springboot.learningspringboot.data.cyclic.CyclicB;
import com.learning.springboot.learningspringboot.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB){
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC){
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA){
        return new CyclicC(cyclicA);
    }
}
