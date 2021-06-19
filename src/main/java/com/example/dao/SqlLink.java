package com.example.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlLink {
    private Connection con;
    //jdbc驱动
    String driver="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/test2?&useSSL=false&serverTimezone=UTC";
    String user="root";
    String password="qinyuan123";
    public SqlLink(){
    }
    public String link(){
        try {
            //注册JDBC驱动程序
            Class.forName(driver);
            //建立连接
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                return ("数据库连接成功");
            }
            //con.close();
        } catch (ClassNotFoundException e) {
            return("数据库驱动没有安装");

        } catch (SQLException e) {
            e.printStackTrace();
            return("数据库连接失败");
        }
        return("数据库连接失败");
    }
    public String checkUser(User user,SqlLink sqlLink){
        String sql="SELECT * FROM user WHERE userName=? and password=?";
        System.out.println("进入");
        try {
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                System.out.println("返回1");
                return "1";//账号密码正确
            }
            else{
                System.out.println("返回0");
                return "0";
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println("返回-1");
        return "-1";
    }
    public  List<String> checkWithDepartment(Agent agent, SqlLink sqlLink){
        String sql="SELECT * FROM agent WHERE department=?";
        List<String> finalList =new ArrayList<>();
        try{
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,agent.getDepartment());
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            while (rs.next()){
                for (int i=1;i<=columnCount;i++){
                    finalList.add((String) rs.getObject(i));
                }
            }
                return finalList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return finalList;
    }
    public  List<String> checkWageWithid(Agent agent, SqlLink sqlLink){
        String sql="SELECT * FROM wage WHERE name=?";
        List<String> finalList =new ArrayList<>();
        try{
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,agent.getName());
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            while (rs.next()){
                for (int i=1;i<=columnCount;i++){
                    finalList.add((String) rs.getObject(i));
                }
            }
            return finalList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return finalList;
    }
    public List<String> checkWithid(Agent agent,SqlLink sqlLink){
        String sql="SELECT * FROM agent WHERE name=?";
        List<String> finalList =new ArrayList<>();
        try{
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,agent.getName());
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            while (rs.next()){
                for (int i=1;i<=columnCount;i++){
                    finalList.add((String) rs.getObject(i));
                }
            }
            return finalList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return finalList;
    }
    public List<String> checkWithOc(Agent agent,SqlLink sqlLink){
        String sql="SELECT * FROM agent WHERE occupation=?";
        List<String> finalList =new ArrayList<>();
        try{
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,agent.getOccupation());
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            while (rs.next()){
                for (int i=1;i<=columnCount;i++){
                    finalList.add((String) rs.getObject(i));
                }
            }
            return finalList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return finalList;
    }
    public List<String> checkWithMa(Agent agent,SqlLink sqlLink){
        String sql="SELECT * FROM agent WHERE marriage=?";
        List<String> finalList =new ArrayList<>();
        try{
            PreparedStatement ps;
            ps=sqlLink.getCon().prepareStatement(sql);
            ps.setString(1,agent.getMarriage());
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData md = rs.getMetaData();//获取键名
            int columnCount = md.getColumnCount();//获取行的数量
            while (rs.next()){
                for (int i=1;i<=columnCount;i++){
                    finalList.add((String) rs.getObject(i));
                }
            }
            return finalList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return finalList;
    }
    public void addAgentMessage(Agent agent,SqlLink sqlLink) throws SQLException {
        String sql="INSERT INTO agent(name,age,occupation,marriage,gender,race,nativePlace,education,department,avatar) VALUES(?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps;
        ps=sqlLink.getCon().prepareStatement(sql);
        ps.setString(1,agent.getName());
        ps.setString(2,agent.getAge());
        ps.setString(3,agent.getOccupation());
        ps.setString(4,agent.getMarriage());
        ps.setString(5,agent.getGender());
        ps.setString(6,agent.getRace());
        ps.setString(7,agent.getNativePlace());
        ps.setString(8,agent.getEducation());
        ps.setString(9,agent.getDepartment());
        ps.setString(10,agent.getAvatar());
        ps.executeUpdate();
    }
    public void agentChange(Agent agent,SqlLink sqlLink) throws SQLException {
        String sql="UPDATE agent SET age=?, occupation=? ,marriage=? ,gender=? ,race=? ,nativePlace=? ,education=?, department=? WHERE name=?";
        PreparedStatement ps;
        ps=sqlLink.getCon().prepareStatement(sql);
        ps.setString(1,agent.getAge());
        ps.setString(2,agent.getOccupation());
        ps.setString(3,agent.getMarriage());
        ps.setString(4,agent.getGender());
        ps.setString(5,agent.getRace());
        ps.setString(6,agent.getNativePlace());
        ps.setString(7,agent.getEducation());
        ps.setString(8,agent.getDepartment());
        ps.setString(9,agent.getName());
        ps.executeUpdate();
    }
    public Connection getCon() {
        return con;
    }
}
