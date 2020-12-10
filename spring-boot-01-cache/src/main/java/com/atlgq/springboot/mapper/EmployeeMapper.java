package com.atlgq.springboot.mapper;

import com.atlgq.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface EmployeeMapper {

    @Insert(value = "insert into employee (lastName,email,gender,d_id) " +
            "values " +
            "(#{lastName},#{email},#{gender},#{d_id})")
    Integer insertEmployee(Employee employee);

    @Select(value = "select * from employee where id = #{id}")
    Employee queryEmployeeById(Integer id);

    @Delete(value = "delete from employee where id = #{id}")
    Integer deleteEmployeeById(Integer id);

    @Update(value = "UPDATE employee set lastName = #{lastName} where id = #{id}")
    Integer updateEmployeeById(Integer id,String lastName);


}
