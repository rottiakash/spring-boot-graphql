package com.example.graph;

import org.springframework.stereotype.Service;

import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.observables.ConnectableObservable;

@Service
public class MyPublisher {
    private Flowable<Student> publisher;
    private ObservableEmitter<Student> emitter;
    private int test;

    public int getTest() {
        return this.test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public MyPublisher() {
        Observable<Student> observable = Observable.create(emitter -> {
            this.emitter = emitter;
        });

        ConnectableObservable<Student> connectableObservable = observable.share().publish();
        connectableObservable.connect();
        connectableObservable.subscribe(data -> {
            System.out.println("The value is" + data);
        });
        this.publisher = connectableObservable.toFlowable(BackpressureStrategy.BUFFER);
    }

    public void publish(Student s) {
        emitter.onNext(s);
    }

    public Flowable<Student> getPublisher() {
        return this.publisher;
    }
}
