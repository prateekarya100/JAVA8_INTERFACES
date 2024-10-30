package org.tomcat.function;

import org.tomcat.data.Employee;
import org.tomcat.data.EmployeeDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class function_interfaces {
    static List<Employee> employeeList= EmployeeDatabase.getEmployees();
    static Function<List<Employee>, HashMap<String,Double>> function=(employees -> {
            HashMap<String,Double> map=new HashMap<>();
            employees.forEach(employee -> {
                if (employee.getSalary()<30000){
                    map.put(employee.getName(),employee.getSalary());
                }
            });
        return map;
    });
    public static void main(String[] args) {
        //print name and position of all employees whose salary lessThan 30k
        System.out.println(function.apply(employeeList));
    }
}
