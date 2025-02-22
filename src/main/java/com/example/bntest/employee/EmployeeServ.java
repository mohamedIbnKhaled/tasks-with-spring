package com.example.bntest.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServ {
    List<Employee> employeeList = new ArrayList<Employee>();
    public void createEmp(int id,String name){
        Employee employee = new Employee(id,name);
        employeeList.add(employee);
        System.out.println("add");
    }
    public void deleteEmp(int id){
        employeeList.removeIf(e -> e.getId()==id);
        System.out.println("delete");
    }
   public void getAll(){
        employeeList.forEach(System.out::println);
       System.out.println("test");
    }
}
