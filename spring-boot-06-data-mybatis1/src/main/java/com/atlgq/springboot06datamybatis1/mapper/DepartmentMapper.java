package com.atlgq.springboot06datamybatis1.mapper;

import com.atlgq.springboot06datamybatis1.pojo.Department;
import com.atlgq.springboot06datamybatis1.pojo.Employee;

public interface DepartmentMapper {

    public Department getDepartmentById(Integer id);

    public int insertDepartment(Department department);

}
