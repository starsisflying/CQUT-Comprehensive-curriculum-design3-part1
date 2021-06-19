package com.example.controller;

import com.example.dao.SqlLink;
import com.example.dao.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/user")
public class LoginController {
//    @RequestMapping(value = "/login")
//    public void login(HttpServletRequest request, HttpServletResponse response){
//        System.out.println(request.getRequestURL());
//        System.out.println(request.getParameter("username"));
//        SqlLink sqlLink=new SqlLink();
//        sqlLink.link();
//        System.out.println();
//
//    }
    @RequestMapping(value = "/login")
    public String login(@RequestBody User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
        String s=sqlLink.checkUser(user,sqlLink);
        if (s.equals("1")){
            return "success";
        }
        else
            return "wrong";
    }
//    @RequestMapping(value = "/login2")
//    public String login2( User user){
//        System.out.println(user.getUsername());
//        System.out.println(user.getPassword());
//        SqlLink sqlLink=new SqlLink();
//        sqlLink.link();
//        String s=sqlLink.checkUser(user,sqlLink);
//        if (s.equals("1")){
//            return "success";
//        }
//        else
//            return "wrong";
//    }
//    @RequestMapping(value = "/login2")
//    public String login2(String name,String password){
//
//    }
}
