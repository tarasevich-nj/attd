package com.tnj.attd.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBMSTest
{
    public String DBMSTest(String[] arg)
    {
        String url = "jdbc:mysql://tnj-ubuntu:3306/att";
        String username = "tnj";
        String password = "passme";
        System.out.println("Connecting...");

        //try (Connection connection = DriverManager.getConnection(url, username, password))
        //{ return "Connection successful!"; } catch (SQLException e)
        //{
        //    e.printStackTrace();
        //    return "Connection failed!";
        //}
        return "done";
    }
}
