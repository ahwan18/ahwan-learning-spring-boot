package com.learning.springboot.learningspringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learning.springboot.learningspringboot.service.MerchantService;
import com.learning.springboot.learningspringboot.service.MerchantServiceImpl;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
