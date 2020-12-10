package com.atlgq.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer d_id;

    public Employee(String lastName, String email, Integer gender, Integer d_id) {
        this.id = 0;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.d_id = d_id;
    }
}
