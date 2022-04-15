package com.cw.CowBullWebGame.UserDataBase;

import java.sql.*;

public class UserDataBaseManager{

    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:mem:users";

    static final String USER = "sa";
    static final String PASSWORD = "";

    String createTableSQL = "CREATE TABLE IF NOT EXISTS USERS (ID IDENTITY NOT NULL PRIMARY KEY, " +
            "NAME VARCHAR NOT NULL, " +
            "PASSWORD VARCHAR NOT NULL)";

    String insertIntoTableSQL = "INSERT INTO USERS VALUES (  )";

    Connection connection = null;;
    Statement statement = null;
    PreparedStatement preparedStatement = null;

    public void insertIntoDB(String username,String password){
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            //statement.executeUpdate(sql);


            preparedStatement = connection.prepareStatement("");
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            preparedStatement.execute();
        } catch (Exception exception){
            exception.printStackTrace();
        }


    }
}