package ru.zachesov.hibernate_one_to_one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_one_to_one.entity.Detail;
import ru.zachesov.hibernate_one_to_one.entity.Employee;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Sergey", "Zachesov", "IT", 500);
//            Detail detail = new Detail("Moscow", "432423242", "zachesov@yandex.ru");
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            session.delete(employee);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
