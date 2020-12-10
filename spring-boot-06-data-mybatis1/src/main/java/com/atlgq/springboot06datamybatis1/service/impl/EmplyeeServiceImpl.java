package com.atlgq.springboot06datamybatis1.service.impl;

import com.atlgq.springboot06datamybatis1.mapper.EmployeeMapper;
import com.atlgq.springboot06datamybatis1.pojo.Employee;
import com.atlgq.springboot06datamybatis1.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class EmplyeeServiceImpl implements EmployeeService {

    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    public Collection<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public int addEmployee(Employee employee) {
         return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployee(Integer id) {
        return employeeMapper.deleteEmployee(id);
    }

    @Override
    public int updateEmployee(String lastName, Integer id) {
        return employeeMapper.updateEmployee(lastName,id);
    }
}
