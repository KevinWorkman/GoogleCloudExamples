package io.happycoding.servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet responsible for creating new tasks. */
@WebServlet("/new-task")
public class NewTaskServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String id = UUID.randomUUID().toString();
    String title = request.getParameter("title");
    long timestamp = System.currentTimeMillis();

    Entity taskEntity = new Entity("Task", id);
    taskEntity.setProperty("title", title);
    taskEntity.setProperty("timestamp", timestamp);
    taskEntity.setProperty("title", title);

    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.put(taskEntity);

    response.sendRedirect("/index.html");
  }
}
