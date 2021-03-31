import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HitServlet", urlPatterns = "/hit")
public class HitServlet extends HttpServlet {

    private int viewCounter;

    public void resetCounter() {
        viewCounter = 0;

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String reset = request.getParameter("reset");


        response.setContentType("text/html");

        viewCounter++;


        PrintWriter hit = response.getWriter();

        if (reset != null) {
            resetCounter();
            hit.println("<h1>Count has been reset!</h1>");
        } else {
            hit.println("<h1>You are guest number: " + viewCounter + "!</h1>");
        }

//        hit.println("<h1>One Hit!</h1>");
    }

}
