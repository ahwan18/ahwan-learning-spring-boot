package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.factory.PaymentGatewayClientFactoryBean;

@Component
@Import(value = {
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {

}
