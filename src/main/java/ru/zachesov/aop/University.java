package ru.zachesov.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Zachesov", 3, 5);
        Student st2 = new Student("Petrov", 1, 4.7);
        Student st3 = new Student("Sidorov", 5, 3.4);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Начало работы getStudents");

//            System.out.println(students.get(3));

//        System.out.println("Information about students");
//        System.out.println(students);
        return students;
    }

}
