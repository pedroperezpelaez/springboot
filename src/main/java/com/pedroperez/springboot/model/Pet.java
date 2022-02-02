package com.pedroperez.springboot.model;

public interface Pet {
    String getName();

    void setName(String name);

    String getType();

    boolean isHungry();

    void feed();
}
