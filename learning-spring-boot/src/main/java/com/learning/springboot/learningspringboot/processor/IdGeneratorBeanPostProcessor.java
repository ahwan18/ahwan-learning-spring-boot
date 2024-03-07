package com.learning.springboot.learningspringboot.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.aware.IdAware;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Id Generator Processor for Bean {}", beanName);
        if (bean instanceof IdAware) {
            log.info("Set Id Generator for Bean {}", beanName);
            IdAware idAware = (IdAware) bean;
            idAware.setID(UUID.randomUUID().toString());
        }
        return bean;
    }

    
}
