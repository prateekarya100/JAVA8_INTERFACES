package org.tomcat.consumer;

import org.tomcat.data.Employee;
import org.tomcat.data.EmployeeDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumer_interfaces {
    static List<Employee> employees = EmployeeDatabase.getEmployees();

    static Consumer<String> names = (employee)->System.out.println(employee);
    public static void main(String[] args) {
        print_employee_names_whose_salary_MoreThan_40K();
    }

    private static void print_employee_names_whose_salary_MoreThan_40K() {
        employees.stream().forEach(employee -> {
            if (employee.getSalary() > 40000) {
                names.accept(employee.getName());
            }
        });
    }
}
