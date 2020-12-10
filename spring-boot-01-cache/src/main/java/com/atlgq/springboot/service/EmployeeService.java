package com.atlgq.springboot.service;

import com.atlgq.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.cache.annotation.Cacheable;

public interface EmployeeService {

    Employee queryEmployeeById(Integer id);

    Integer insertEmployee(Employee employee);

    Integer deleteEmployeeById(Integer id);

    Integer updateEmployeeById(Integer id,String lastName);


}
