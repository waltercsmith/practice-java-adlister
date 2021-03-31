
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "PageViewCounter", urlPatterns = "/count")
public class PageViewCounter extends HttpServlet{

    private int viewCounter;

    public void resetCounter(){
        viewCounter = 0;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException{

        String reset = request.getParameter("reset");

        response.setContentType("html/text");

        viewCounter++;

        PrintWriter out = response.getWriter();


        if (reset != null) {
            resetCounter();
            out.println("<h1>Count has been reset!</h1>");
        } else {
            out.println("<h1>You are guest number: " + viewCounter + "!</h1>");
        }



    }
}
