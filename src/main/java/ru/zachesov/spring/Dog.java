package ru.zachesov.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
@Scope("prototype")
public class Dog implements Pet {

//    private String name;

    public Dog() {
        System.out.println("Dog has been created");
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void init() {
        System.out.println("Class.Dog init method");
    }

    public void destroy() {
        System.out.println("Class.Dog destroy method");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
