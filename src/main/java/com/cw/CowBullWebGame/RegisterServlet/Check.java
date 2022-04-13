package com.cw.CowBullWebGame.RegisterServlet;

public class Check {

    public static boolean checkFields (String username, String password, String repeatPassword){
        if ((username!=null)&(password!=null)&(repeatPassword!=null)){
            if (password.equals(repeatPassword))
                return true;
        }
        return false;
    }
}
