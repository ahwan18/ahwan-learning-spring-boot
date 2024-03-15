package com.learning.springboot.learningspringboot.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.data.User;
import com.learning.springboot.learningspringboot.event.LoginSuccesEvent;

@Component
public class UserService implements ApplicationEventPublisherAware{

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if (isLoginSuccess(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccesEvent(new User(username)));
            return true;
        } else {
            return false;
        }
    }

    public boolean isLoginSuccess(String username, String password){
        return "ahmad".equals(username) && "kurniawan".equals(password);
        
    }

}
