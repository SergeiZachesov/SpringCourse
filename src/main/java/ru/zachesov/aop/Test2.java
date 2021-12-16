package ru.zachesov.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.AnnotatedArrayType;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = context.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> studentList = university.getStudents();
            System.out.println(studentList);
        } catch (Exception e) {
            System.out.println(e);
        }


        context.close();
    }
}
