package com.atlgq.springboot06datamybatis1.mapper;

import com.atlgq.springboot06datamybatis1.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.Collection;

//@Mapper
public interface EmployeeMapper {

    //查询所有数据
    @Select(value = "select * from employee")
    public Collection<Employee> getAllEmployee();

    //增加一个数据
    @Insert(value = "insert into employee(lastName,email,gender,d_id) " +
            "values" +
            "(#{lastName},#{email},#{gender},#{d_id})")
    public int addEmployee(Employee employee);

    //删除数据
    @Delete(value = "delete from employee where id = #{id}")
    public int deleteEmployee(Integer id);

    //修改数据
    @Update(value = "update employee set lastName = #{lastName} where id = #{id}")
    public int updateEmployee(String lastName,Integer id);
}
