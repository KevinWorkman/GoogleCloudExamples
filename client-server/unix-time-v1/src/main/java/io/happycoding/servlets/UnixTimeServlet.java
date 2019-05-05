package io.happycoding.servlets;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/time.html")
public class UnixTimeServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    long unixTimeSeconds = System.currentTimeMillis() / 1000;

    response.setContentType("text/html;");
    response.getWriter().println("<h1>Unix Time</h1>");
    response.getWriter().println("<p>Current Unix time: " + unixTimeSeconds + "</p>");
    response.getWriter().println("<p>(<a href=\"\">Refresh</a>)</p>");
  }
}

