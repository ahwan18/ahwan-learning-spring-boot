package com.learning.springboot.learningspringboot.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.event.LoginSuccesEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginSuccesListener implements ApplicationListener<LoginSuccesEvent>{@Override
    public void onApplicationEvent(LoginSuccesEvent event) {
     log.info("Success Login for User{}", event.getUser());   
    }
}
