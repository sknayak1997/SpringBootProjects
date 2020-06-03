package com.sagar.helloworld.controller;

import com.sagar.helloworld.model.HelloWorldModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloWorldModel model;

    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public String helloWorld() {
        return model.helloWorld();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String helloBuddy(@RequestParam(name = "name", defaultValue = "world") String name) {
        return model.helloBuddy(name);
    }
}
