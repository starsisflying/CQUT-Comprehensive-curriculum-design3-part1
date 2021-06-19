package com.example.controller;

import com.example.dao.Agent;
import com.example.dao.SqlLink;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping(value = "/user2")
public class AgentEnteringController {
    @RequestMapping(value = "/entering")
    public void agentEntering(@RequestBody Agent agent) throws SQLException {
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
        sqlLink.addAgentMessage(agent,sqlLink);
        System.out.println(agent.toString());
    }
    @RequestMapping(value = "/changeAgent")
    public void agentChange(@RequestBody Agent agent) throws SQLException {
        System.out.println("进入");
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
        sqlLink.agentChange(agent,sqlLink);
        System.out.println(agent.toString());
    }
    @RequestMapping(value = "/checkWithDepartment")
    public List<String> checkWithDepartment(@RequestBody Agent agent) throws SQLException {
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
//        System.out.println(agent.getDepartment());
        List<String> s=sqlLink.checkWithDepartment(agent,sqlLink);
//        System.out.println(s.get(1));
//        System.out.println("长度"+s.size());
        for (String s1:s){
            System.out.println(s1);
        }
        return s;
    }
    @RequestMapping(value="/checkWithid")
    public List<String> checkWithid(@RequestBody Agent agent){
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
        System.out.println(agent.getName());
        List<String> s=sqlLink.checkWithid(agent,sqlLink);
        for (String s1:s){
            System.out.println(s1);
        }
        return s;
    }
    @RequestMapping(value="/checkWithOc")
    public List<String> checkWithOc(@RequestBody Agent agent){
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
//        System.out.println(agent.getName());
        List<String> s=sqlLink.checkWithOc(agent,sqlLink);
        for (String s1:s){
            System.out.println(s1);
        }
        return s;
    }
    @RequestMapping(value="/checkWithMa")
    public List<String> checkWithMa(@RequestBody Agent agent){
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
//        System.out.println(agent.getName());
        List<String> s=sqlLink.checkWithMa(agent,sqlLink);
        for (String s1:s){
            System.out.println(s1);
        }
        return s;
    }
    @RequestMapping(value="/checkWageWithid")
    public List<String> checkWageWithid(@RequestBody Agent agent){
        SqlLink sqlLink=new SqlLink();
        sqlLink.link();
//        System.out.println(agent.getName());
        List<String> s=sqlLink.checkWageWithid(agent,sqlLink);
        for (String s1:s){
            System.out.println(s1);
        }
        return s;
    }

}
