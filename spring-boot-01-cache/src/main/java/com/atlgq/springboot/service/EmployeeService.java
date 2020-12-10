package com.atlgq.springboot.service;

import com.atlgq.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeService {

    Integer insertEmployee(Employee employee);

    Employee queryEmployeeById(Integer id);

    Integer deleteEmployeeById(Integer id);

    Integer updateEmployeeById(Integer id,String lastName);
}
