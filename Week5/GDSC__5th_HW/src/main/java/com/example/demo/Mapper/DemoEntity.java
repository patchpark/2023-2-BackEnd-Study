package com.example.demo.Mapper;

public class DemoEntity {
    private long id;
    private String name;

    public DemoEntity(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
