package org.tomcat.consumer;

import org.tomcat.data.Employee;
import org.tomcat.data.EmployeeDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumer_name_and_salary {
    static List<Employee> employees= EmployeeDatabase.getEmployees();
    static BiConsumer<String,Double> nameAndSalary = (name,salary)->{
        System.out.println(name+" :: "+salary);
    };

       public static void main(String[] args) {
           employees.forEach((employee -> {
               nameAndSalary.accept(employee.getName(),employee.getSalary());
           }));
    }
}
