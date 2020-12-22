package com.example.graph;

import org.reactivestreams.Publisher;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLSubscriptionResolver;

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
