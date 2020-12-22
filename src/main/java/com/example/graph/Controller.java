package com.example.graph;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
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
    public String post() {
        myPublisher.publish(new Student(1, "Akash", "1BI17CS010"));
        return "The Value is "+this.myPublisher.getTest();
    }
}
