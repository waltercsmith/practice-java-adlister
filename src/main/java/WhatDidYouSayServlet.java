import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet(name = "WhatDidYouSayServlet", urlPatterns = "/what-num")
public class WhatDidYouSayServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String userSaid = request.getParameter("said");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        if (userSaid != null){
            out.printf("<h1>User said: %s</h1>", userSaid);
        } else {
            out.println("<h1>You're no fun, you know?</h1>");
        }
    }
}
