package ru.zachesov.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_test.entity.Employee;

import java.util.List;

public class Test4 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery("from Employee where name = 'Sergei'").getResultList();
            employees.forEach(e -> e.setSalary(2000));

            //Employee employee = session.get(Employee.class, 15);
            //employee.setSalary(1500);


            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }

}
