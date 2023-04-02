package com.fuadaliyev.aop.service;

import com.fuadaliyev.aop.model.Employee;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee employee){
        this.employee=employee;
    }
}
