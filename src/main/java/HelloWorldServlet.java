import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {


        String userInput = req.getParameter("input");
        response.setContentType("text/html");
        if (userInput != null) {
            PrintWriter out = response.getWriter();
//        out.println("<h1>Hello, World!<h1>");
            out.printf("<h1>Hello, %s</h1>", userInput); // <--- when the user types ?input= the page will display Hello, and what every that was typed
        } else {
            PrintWriter out1 = response.getWriter();
            out1.println("<h1>Hello, World</h1>");
        }

    }

}
