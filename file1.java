import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String num1 = request.getParameter("num1");
        String num2 = request.getParameter("num2");

        int sum = Integer.parseInt(num1) + Integer.parseInt(num2);

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Adding Two Numbers</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>The sum of " + num1 + " and " + num2 + " is " + sum + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
