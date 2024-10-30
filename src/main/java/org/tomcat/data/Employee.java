package org.tomcat.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor @NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;
    private String position;
    private String phone;
    private String email;
    private String project;
    private List<String> skills;
}
