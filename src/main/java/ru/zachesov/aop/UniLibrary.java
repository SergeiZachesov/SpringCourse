package ru.zachesov.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("Мы берем книгу из UnyLibrary");
        System.out.println("-------------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Мы возвращаем книги в UnyLibrary");
        return "Война и мир";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UnyLibrary");
        System.out.println("-------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("Мы возращаем журнал в SchoolLibrary");
        System.out.println("-------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавляем книгу в UnyLibrary");
        System.out.println("-------------------------------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UnyLibrary");
        System.out.println("-------------------------------------");
    }

}
