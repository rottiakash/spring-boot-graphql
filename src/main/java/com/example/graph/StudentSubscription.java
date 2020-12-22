package com.example.graph;

import com.coxautodev.graphql.tools.GraphQLSubscriptionResolver;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

@Component
public class StudentSubscription implements GraphQLSubscriptionResolver {

    private MyPublisher mPublisher;

    public StudentSubscription(MyPublisher myPublisher) {
        this.mPublisher = myPublisher;
        this.mPublisher.setTest(10);
        System.out.println("Subscriber Started");
    }

    public Publisher<Student> live() {
        System.out.println("Subscribed");
        return mPublisher.getPublisher();
    }
}
