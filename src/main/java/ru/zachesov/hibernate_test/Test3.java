package ru.zachesov.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_test.entity.Employee;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Andrey", "Semenov", "HR", 800);
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList();
            List<Employee> employees = session.createQuery("from Employee where salary > 600")
                    .getResultList();

            session.getTransaction().commit();

            System.out.println(employees);
        } finally {
            factory.close();
        }
    }

}
