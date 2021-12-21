package ru.zachesov.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_test.entity.Employee;

import java.util.List;

public class Test5 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            //  Employee employee = session.get(Employee.class, 1);
            session.createQuery("delete Employee where salary > 1500").executeUpdate();
            //session.createQuery("from Employee where salary > 1500")
           //         .getResultList().forEach(System.out::println);

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}
