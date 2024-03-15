package com.learning.springboot.learningspringboot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.event.LoginSuccesEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccesEvent.class)
    public void onLoginSuccessEvenet(LoginSuccesEvent event){
        log.info("Login Success for User {}", event.getUser());
    }
}
