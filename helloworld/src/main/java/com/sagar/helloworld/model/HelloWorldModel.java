package com.sagar.helloworld.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldModel {

    public HelloWorldModel() {
        System.out.println("Model Class Default Constructor Called");
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String helloBuddy(String name) {
        return "hello " + name;
    }
}
