package com.example.graph;

import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Controller {

    private MyPublisher myPublisher;

    public Controller(MyPublisher myPublisher) {
        this.myPublisher = myPublisher;
        System.out.println(this.myPublisher.getTest());
    }

    @PostMapping("/post")
    public String post(@RequestBody Student s) {
        myPublisher.publish(s);
        return "The Student is " + s.getName();
    }
}
