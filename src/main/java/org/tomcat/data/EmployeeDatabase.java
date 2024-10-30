package org.tomcat.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeDatabase {
    public static List<Employee> getEmployees(){
      return List.of(
              new Employee(1, "prateek arya", 25, 32000, "java delivery", "programmer", "9650841442", "prateek@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(2, "vishal rathi", 15, 42000, "java", "programmer trainee", "9650841442", "vishal@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(3, "amit kumar", 35, 52000, "java", "programmer", "9650841442", "amit@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(4, "varnita makrariya", 25, 62000, "iot io practice", "programmer trainee", "9650841442", "varnita@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(5, "ravina yadav", 25, 22000, "medical", "manager", "9650841442", "ravina@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(6, "mayank singh", 25, 32000, "duck greek", "programmer", "9650841442", "mayank@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(7, "naveen kumar", 32, 26000, ".net", "manager", "9650841442", "naveen@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker")),
              new Employee(8, "prateek kuhad", 28, 55000, "python", "data analyst", "9650841442", "pratik.k@gmail.com", "broadridge", List.of("java", "springboot", "microservices", "docker"))
      );
     };
}
