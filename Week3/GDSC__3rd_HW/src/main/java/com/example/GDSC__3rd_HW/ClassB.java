package com.example.GDSC__3rd_HW;


import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
    }
}