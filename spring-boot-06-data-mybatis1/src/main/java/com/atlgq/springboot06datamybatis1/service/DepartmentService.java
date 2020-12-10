package com.atlgq.springboot06datamybatis1.service;

import com.atlgq.springboot06datamybatis1.pojo.Department;

public interface DepartmentService {

    public Department getDepartmentById(Integer id);

    public int insertDepartment(Department department);

}
