package com.atlgq.springboot.service.impl;

import com.atlgq.springboot.mapper.EmployeeMapper;
import com.atlgq.springboot.pojo.Employee;
import com.atlgq.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeImpl implements EmployeeService
{
    @Resource
    private EmployeeMapper mapper;
    @Override
    public Integer insertEmployee(Employee employee) {
        return mapper.insertEmployee(employee);
    }

    @Override
    public Employee queryEmployeeById(Integer id) {
        return mapper.queryEmployeeById(id);
    }

    @Override
    public Integer deleteEmployeeById(Integer id) {
        return mapper.deleteEmployeeById(id);
    }

    @Override
    public Integer updateEmployeeById(Integer id, String lastName) {
        return mapper.updateEmployeeById(id,lastName);
    }
}
