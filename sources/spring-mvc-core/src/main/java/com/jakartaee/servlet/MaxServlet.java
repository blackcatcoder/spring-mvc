package com.jakartaee.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MaxServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    // Writing the message on the web page
    PrintWriter out = resp.getWriter();
    out.println("Max Servlet");
    
    // get config from context, any servlet can get info form context
    ServletContext servletContext = getServletContext();
    out.println(servletContext.getInitParameter("name"));
    out.println(servletContext.getInitParameter("website"));
    
    
    // get config from config of it own servlet
    ServletConfig servletConfig = getServletConfig();
    out.println(servletConfig.getInitParameter("name"));
    out.println(servletConfig.getInitParameter("website"));
  }
}
