package com.learning.springboot.learningspringboot.event;

import org.springframework.context.ApplicationEvent;

import com.learning.springboot.learningspringboot.data.User;

import lombok.Getter;

public class LoginSuccesEvent extends ApplicationEvent{

    @Getter
    private final User user;

    public LoginSuccesEvent(User user){
        super(user);
        this.user = user;
    }

}
