package com.luv2code.springdemo.testDb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;


@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    private static final long serialVersionUID=1L;

    public static void main(String[] args) {
        String user = "springstudent1";
        String pass = "Sohail@99";

        String url = "jdbc:mysql://localhost:3306/web_customer_tracker?allowPublicKeyRetrieval=true&useSSL=False&serverTimeZone=UTC";

        String driver = "com.mysql.cj.jdbc.Driver";
        Connection connection;

        try{

            Class.forName(driver);
            connection=DriverManager.getConnection(url,user,pass);
            System.out.println("connection success");
            connection.close();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            System.out.println("Successfully closed");
        }
    }
}
