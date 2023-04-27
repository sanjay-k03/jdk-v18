import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals("myusername") && password.equals("mypassword")) {
            // Create a new cookie with the user's username and set the expiration time to 24 hours
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Successful</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login Successful</h1>");
            out.println("<p>Welcome, " + username + "!</p>");
            out.println("</body>");
            out.println("</html>");
        } else {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login Failed</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login Failed</h1>");
            out.println("<p>Invalid username or password.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
