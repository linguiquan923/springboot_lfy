package com.atlgq.springboot.entites;

import javax.persistence.*;

//告诉容器这是一个和数据库映射的实体类
@Entity
@Table(name = "user_table")  //如果默认的话是采用user小写命名
public class User {

    @Id //表明这是主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column(name = "lastName",length = 100) //表明这是和数据库对应的列
    private String lastName;


    public User(Integer id, String lastName) {
        this.id = id;
        this.lastName = lastName;
    }

    public User() {
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
