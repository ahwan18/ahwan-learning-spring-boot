package com.learning.springboot.learningspringboot.runnerapp;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
 
@SpringBootApplication
public class RunnerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunnerApplication.class, args); 
    }

    @Slf4j
    @Component
    public static class SimpleRunner implements ApplicationRunner {

        @Override
        public void run(ApplicationArguments args) throws Exception {
        List<String> profiles = args.getOptionValues("profiles");    
        log.info("profiles : {}", profiles);
        }
    
        
    }
}
