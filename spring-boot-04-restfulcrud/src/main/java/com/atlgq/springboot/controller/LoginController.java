package com.atlgq.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Map<String,Object> maps, HttpSession session){
        if(!StringUtils.isEmpty(username) && password.endsWith("123456")){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else{
            maps.put("msg","登录失败");
            return "login";
        }
    }
    @GetMapping(value = "/dashboard")
    public String dashboard(){
        return "list";
    }

}
