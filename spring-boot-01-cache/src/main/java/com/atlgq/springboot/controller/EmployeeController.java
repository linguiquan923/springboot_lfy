package com.atlgq.springboot.controller;

import com.atlgq.springboot.pojo.Employee;
import com.atlgq.springboot.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;

    @GetMapping(value = "/insert")
    public Integer insert(){
        Employee employee = new Employee("xiaohong","xiaohong@qq.com",1,1001);
        return employeeService.insertEmployee(employee);
    }

    @GetMapping(value = "delete/{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return employeeService.deleteEmployeeById(id);
    }

    @GetMapping(value = "/update/{id}/{lastName}")
    public Integer update(@PathVariable("id") Integer id, @PathVariable("lastName") String lastName)
    {
        return  employeeService.updateEmployeeById(id,lastName);
    }
    @GetMapping(value = "/query/{id}")
    public Employee query(@PathVariable("id") Integer id){
        return employeeService.queryEmployeeById(id);
    }

}
