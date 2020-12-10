package com.atlgq.springboot06datamybatis1.service.impl;

import com.atlgq.springboot06datamybatis1.mapper.DepartmentMapper;
import com.atlgq.springboot06datamybatis1.pojo.Department;
import com.atlgq.springboot06datamybatis1.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDepartmentById(id);
    }

    @Override
    public int insertDepartment(Department department) {
        return departmentMapper.insertDepartment(department);
    }
}
