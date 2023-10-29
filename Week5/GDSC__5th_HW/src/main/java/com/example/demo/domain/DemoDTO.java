package com.example.demo.domain;

import lombok.Getter;

@Getter
public class DemoDTO {
    private Long id;
    private String name;

    public DemoDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
