package com.example.graph;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class StudentsQueryResolver implements GraphQLQueryResolver {
    List<Student> Result;

    StudentsQueryResolver() {
        this.Result = new ArrayList<Student>();
        this.Result.add(new Student(0, "Akash", "1BI17CS010"));
        this.Result.add(new Student(1, "Anand", "1BI17CS015"));
    }

    public List<Student> students() {
        System.out.println("Query got");
        return this.Result;
    }

    public String hello()
    {
        return "Hello";
    }
}
