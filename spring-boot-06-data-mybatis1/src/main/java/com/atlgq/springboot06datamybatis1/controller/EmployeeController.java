package com.atlgq.springboot06datamybatis1.controller;

import com.atlgq.springboot06datamybatis1.pojo.Employee;
import com.atlgq.springboot06datamybatis1.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Collection;

@ResponseBody
@Controller
public class EmployeeController {

    @Resource
    private EmployeeService employeeService;


    @GetMapping(value = "/getAllEmployee")
    public Collection<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }


    @GetMapping(value = "/addEmployee")
    public String addEmployee(){
        Employee employee1 = new Employee(0,"xiaoming","xiaoming@qq.com",1,1001);
        if(employeeService.addEmployee(employee1) != 0){
            return "add success";
        }else {
            return "add false";
        }
    }

    @GetMapping(value = "/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){

        if(employeeService.deleteEmployee(id) != 0){
            return "delete success";
        }else {
            return "delete false";
        }
    }

    @GetMapping(value = "/updateEmployee/{lastName}/{id}")
    public String deleteEmployee(@PathVariable("lastName") String lastName,@PathVariable("id") Integer id){

        if(employeeService.updateEmployee(lastName,id) != 0){
            return "update success";
        }else {
            return "update false";
        }
    }


}
