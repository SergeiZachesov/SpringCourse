package ru.zachesov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean("myPet", Dog.class);
//        myDog.setName("Стрелка");
//        Dog yourDog = context.getBean("myPet", Dog.class);
//        yourDog.setName("Белка");
//
//        System.out.println(myDog + "" + yourDog);
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());



        context.close();
    }
}
