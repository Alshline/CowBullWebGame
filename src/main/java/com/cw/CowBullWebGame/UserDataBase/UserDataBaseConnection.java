package com.cw.CowBullWebGame.UserDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class UserDataBaseConnection {

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:users";

    static final String USER = "sa";
    static final String PASSWORD = "";

    public void getConnection(){
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Users (ID INT, NAME VARCHAR, PASSWORD VARCHAR )";
            statement.execute(sql);
            statement.close();
            connection.close();
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void insertIntoDB(){

    }

}
