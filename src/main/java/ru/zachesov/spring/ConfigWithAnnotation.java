package ru.zachesov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotation {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext3.xml");


//        Cat cat = context.getBean("cat", Cat.class);
//        cat.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
