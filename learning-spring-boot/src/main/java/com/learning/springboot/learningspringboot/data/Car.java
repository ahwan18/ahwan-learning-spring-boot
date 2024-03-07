package com.learning.springboot.learningspringboot.data;

import org.springframework.stereotype.Component;

import com.learning.springboot.learningspringboot.aware.IdAware;

import lombok.Getter;

@Component
public class Car implements IdAware{

    @Getter
    private String id;

    @Override
    public void setID(String id) {
        this.id = id;
    }

    
}
