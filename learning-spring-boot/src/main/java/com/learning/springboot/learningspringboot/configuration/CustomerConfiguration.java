package com.learning.springboot.learningspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learning.springboot.learningspringboot.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {

    @Bean
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    @Bean
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }

}
