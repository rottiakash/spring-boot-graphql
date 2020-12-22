package com.example.graph;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import graphql.kickstart.tools.GraphQLQueryResolver;

@Service
public class StudentsQueryResolver implements GraphQLQueryResolver {
    List<Student> Result;

    StudentsQueryResolver() {
        this.Result = new ArrayList<Student>();
        this.Result.add(new Student(0, "Akash", "1BI17CS010"));
        this.Result.add(new Student(1, "Anand", "1BI17CS015"));
    }

    public List<Student> students() {
        return this.Result;
    }
}
