package com.cw.CowBullWebGame.RegisterServlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static com.cw.CowBullWebGame.RegisterServlet.Check.checkFields;

@WebServlet("/Register")
public class RegisterServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String repeatPassword = request.getParameter("repeatPassword");



        if (request.getParameter("registerUser") != null){
            if (checkFields(username,password,repeatPassword)){
            }
        }
    }
}
