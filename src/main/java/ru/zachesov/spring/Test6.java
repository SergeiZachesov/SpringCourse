package ru.zachesov.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet pet = context.getBean("catBean", Pet.class);
//        Pet pet2 = context.getBean("catBean", Pet.class);
//        pet.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.callYourPet();
    }
}
