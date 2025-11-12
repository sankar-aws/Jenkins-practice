@WebServlet("/")  // maps root path
public class App extends HttpServlet {

package com.example.instagram;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/app")
public class App extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private List<String> posts = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("posts", posts);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newPost = request.getParameter("post");
        if (newPost != null && !newPost.isEmpty()) {
            posts.add(newPost);
        }
        response.sendRedirect("app");
    }
}
}
