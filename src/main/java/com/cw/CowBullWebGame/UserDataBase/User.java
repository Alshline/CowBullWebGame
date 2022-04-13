package com.cw.CowBullWebGame.UserDataBase;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class User implements Serializable {

    @Setter
    private int id;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private int countOfTrys;

    public String toString(){
        return "User [id=" +id+
                ",username=" +username+
                ",password=" +password+
                ",try=" +countOfTrys+ "]";
    }


}
