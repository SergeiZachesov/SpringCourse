package ru.zachesov.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_many_to_many.entity.Child;
import ru.zachesov.hibernate_many_to_many.entity.Section;
import ru.zachesov.spring.Person;


public class Test {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();
             Session session = factory.getCurrentSession()
        ) {

//            Section section1 = new Section("Football");
//            Child child1 = new Child("Sergei", 10);
//            Child child2 = new Child("Dima", 5);
//            Child child3 = new Child("Gosha", 1);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            Section section1 = new Section("Volleyball");
//            Section section2 = new Section("Hockey");
//            Section section3 = new Section("Ski");
//            Child child1 = new Child("Dima", 6);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            Section section1 = new Section("Football");
//            Child child1 = new Child("Sergei", 10);
//            Child child2 = new Child("Dima", 5);
//            Child child3 = new Child("Gosha", 1);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.save(child1);
//            session.save(child2);
//            session.save(child3);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            Section section1 = new Section("Math");
//            Child child1 = new Child("Oleg", 6);
//            Child child2 = new Child("Vetal", 12);
//            Child child3 = new Child("Dima", 3);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 7);
//
//            session.delete(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//          ******************************
            session.beginTransaction();

            Child child = session.get(Child.class, 5);

            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!");
        }

    }
}
