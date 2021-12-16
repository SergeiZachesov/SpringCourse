package ru.zachesov.aop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.zachesov.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students) {
//
//        Student firstStudent = students.get(0);
//        String nameFirstStudent = firstStudent.getSurname();
//        nameFirstStudent = "Mr. " + nameFirstStudent;
//        firstStudent.setSurname(nameFirstStudent);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 2;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterGetStudentsLoggingAdvice: логируем получение списка студентов после работы метода getStudents");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем вывод исключения " + exception);
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем окончание работы");
    }

}
