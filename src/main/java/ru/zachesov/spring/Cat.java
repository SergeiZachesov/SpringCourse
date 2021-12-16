package ru.zachesov.spring;


import org.springframework.stereotype.Component;

//@Component
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat has been created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
