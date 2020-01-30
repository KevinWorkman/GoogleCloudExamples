package io.happycoding.servlets;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Servlet responsible for deleting tasks. */
@WebServlet("/delete-task")
public class DeleteTaskServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String id = request.getParameter("id");

    Key taskEntityKey = KeyFactory.createKey("Task", id);
    DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
    datastore.delete(taskEntityKey);
  }
}
