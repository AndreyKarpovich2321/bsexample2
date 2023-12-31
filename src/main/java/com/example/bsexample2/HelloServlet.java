package com.example.bsexample2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/login")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        var login = request.getParameter("login");
        var password = request.getParameter("password");
        var currLogin = request.getServletContext().getInitParameter("currLogin");
        var currPass = request.getServletContext().getInitParameter("currPass");
        if (login.equals(currLogin) && password.equals(currPass)){
            response.sendRedirect("success.html");
        } else {response.sendRedirect("error.html");}
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + request.getParameter("login") + request.getParameter("password") + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}