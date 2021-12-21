package ru.zachesov.hibernate_one_to_many_uni;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_one_to_many_uni.entity.Department;
import ru.zachesov.hibernate_one_to_many_uni.entity.Employee;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Nikolay", "Timurov", 900);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            session.beginTransaction();
//            session.save(department);

//            session.getTransaction().commit();
//###
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();

//###
            session = factory.getCurrentSession();

            session.beginTransaction();
           Department department = session.get(Department.class,3);

            session.delete(department);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
