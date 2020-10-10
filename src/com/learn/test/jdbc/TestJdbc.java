package com.learn.test.jdbc;

import java.sql.*;

public class TestJdbc {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        Driver driver = null;
        try {
            //加载驱动
            // Class.forName加载完驱动类后，开始执行静态代码块时，会new一个Driver，
            // 并调用DriverManager的registerDriver把Driver给注册到自己的驱动程序管理器（DriverManager）中去
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://miniapp.lqcoder.com:3306/test","root","123456");
            // 执行查询
            stmt = conn.createStatement();
            String sql;
            sql = "select * from test.student";
            ResultSet rs = stmt.executeQuery(sql);
            // 展开结果集数据库
            while(rs.next()){
                // 通过字段检索
                int id  = rs.getInt("id");
                String name = rs.getString("name");
                // 输出数据
                System.out.print("ID: " + id);
                System.out.print("名称: " + name);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }
}
