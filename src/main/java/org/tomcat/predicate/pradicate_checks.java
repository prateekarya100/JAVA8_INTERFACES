package org.tomcat.predicate;

import org.tomcat.data.Employee;
import org.tomcat.data.EmployeeDatabase;
import java.util.List;
import java.util.function.Predicate;

public class pradicate_checks {
    static List<Employee> employees = EmployeeDatabase.getEmployees();
    static Predicate<Employee> roleManager=(role)->role.getPosition().equals("manager");

    public static void main(String[] args) {
        employees.stream()
                .filter(roleManager)
                .forEach(System.out::println);
    }
}
