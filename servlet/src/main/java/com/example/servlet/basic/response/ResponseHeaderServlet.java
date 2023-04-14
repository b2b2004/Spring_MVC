package com.example.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")

public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //[status-line]
        response.setStatus(HttpServletResponse.SC_OK); //200

        //[response-headers]
        response.setHeader("Content-Type", "text/plain;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header","hello");

        // Content 편의 메서드
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");

        // cookie 편의 메서드
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600); //600초

        // redirect 편의 메서드
        response.sendRedirect("/basic/hello-form.html");

        //[message body]
        PrintWriter writer = response.getWriter();
        writer.println("ResponseHeaderServlet TEST");
    }
}
