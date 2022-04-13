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

    Connection connection;
    Statement statement;

    public void getConnection(){
        this.connection = null;
        this.statement = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Users (ID IDENTITY NOT NULL PRIMARY KEY, " +
                    "NAME VARCHAR NOT NULL, " +
                    "PASSWORD VARCHAR NOT NULL)";
            statement.execute(sql);
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }

    public void closeConnection(){
        try{
            this.statement.close();
            this.connection.close();
        } catch (SQLException sqlException){
            sqlException.printStackTrace();
        }

    }

    public void insertIntoDB(String username,String password){
        getConnection();

        String sql = "INSERT INTO Users VALUES "

    }

    public void connectToDB(Connection connection, Statement statement){



    }

}
