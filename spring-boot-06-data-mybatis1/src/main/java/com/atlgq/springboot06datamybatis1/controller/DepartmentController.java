package com.atlgq.springboot06datamybatis1.controller;

import com.atlgq.springboot06datamybatis1.pojo.Department;
import com.atlgq.springboot06datamybatis1.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@ResponseBody
@Controller
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @GetMapping(value = "/getDepartmentById/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){
        return departmentService.getDepartmentById(id);
    }

}
