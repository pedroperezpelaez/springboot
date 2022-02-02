package com.pedroperez.springboot.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Dog implements Pet {
    private String name;
    private boolean hungry;

    public Dog() {
        super();
        this.hungry = true;
    }


    @Override
    public String getType() {
        return "DOG";
    }

    @Override
    public void feed() {
        this.hungry = false;
    }
}
