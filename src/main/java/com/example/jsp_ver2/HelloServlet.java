package com.example.jsp_ver2;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
  private String message;

  public void init() {
    message = "Hello World!";
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html");
    String name = request.getParameter("name");

    // Hello
    PrintWriter out = response.getWriter();

    out.println("<html><body>");
    out.println("<h1>" + message + "</h1>");
    out.println("</body></html>");
    out.println("name");
  }

  public void destroy() {
  }
}