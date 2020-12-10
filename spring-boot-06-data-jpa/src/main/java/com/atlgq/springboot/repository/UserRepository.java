package com.atlgq.springboot.repository;

import com.atlgq.springboot.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

//这次传入的User是指数据库对应的实体类，Integer指主键对应的数据类型
public interface UserRepository extends JpaRepository<User,Integer> {
}
