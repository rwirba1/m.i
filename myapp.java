import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome to M.I Tech</title>");
        out.println("<style>");
        out.println("img {");
        out.println("    display: block;");
        out.println("    max-width: 100%;");
        out.println("    height: auto;");
        out.println("    margin: 20px auto;");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>WELCOME TO M.I TECH LLC</h1>");
        out.println("<p>Welcome To The Devops Class</p>");
        out.println("<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzEXaslIOLnDdDLE3Q9G_Qj8Hh9IhehLLClg&usqp=CAU'>");
        out.println("</body>");
        out.println("</html>");
    }
}
