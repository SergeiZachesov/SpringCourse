package ru.zachesov.hibernate_one_to_one;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_one_to_one.entity.Detail;
import ru.zachesov.hibernate_one_to_one.entity.Employee;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

            session.beginTransaction();

//            Detail detail = session.get(Detail.class, 5);
//            System.out.println(detail.getEmployee());

            Detail detail = session.get(Detail.class, 2);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
