package com.example.graph;

public class Student {
    private int id;
    private String name;
    private String usn;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsn() {
        return this.usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public Student() {
    }

    Student(int id, String name, String usn) {
        this.id = id;
        this.name = name;
        this.usn = usn;
    }

}
