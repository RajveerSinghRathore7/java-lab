package com.practice;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;


public class myservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
    {
        System.out.println("this is get method");
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.print("this the method of servlet");
    }
    
    
}
