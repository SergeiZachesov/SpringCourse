package ru.zachesov.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_test.entity.Employee;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Andrey", "Semenov", "HR", 800);

            session.beginTransaction();
            session.save(employee);
//            session.getTransaction().commit();

            int id = employee.getId();
//            session = factory.getCurrentSession();
//            session.beginTransaction();
            Employee employeeGet = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println(employeeGet);

        } finally {
            factory.close();
        }
    }

}
