package com.atlgq.springboot06datamybatis1.service;

import com.atlgq.springboot06datamybatis1.pojo.Employee;
import org.springframework.stereotype.Service;

import java.util.Collection;

public interface EmployeeService {

    public Collection<Employee> getAllEmployee();

    public int addEmployee(Employee employee);

    public int deleteEmployee(Integer id);

    public int updateEmployee(String lastName,Integer id);


}
