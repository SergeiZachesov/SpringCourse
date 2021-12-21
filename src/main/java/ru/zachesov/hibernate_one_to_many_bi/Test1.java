package ru.zachesov.hibernate_one_to_many_bi;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.zachesov.hibernate_one_to_many_bi.entity.Department;
import ru.zachesov.hibernate_one_to_many_bi.entity.Employee;


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
//            Department department = new Department("Sales", 100, 1000);
//            Employee employee1 = new Employee("Sergei", "Zachesov", 800);
//            Employee employee2 = new Employee("Oleg", "Mishin", 400);
//            Employee employee3 = new Employee("Misha", "Olegov", 700);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//###
            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 4);
            System.out.println(department);

            session.getTransaction().commit();
            System.out.println("Show to employee");
            System.out.println(department.getEmps());

//###
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class,4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
