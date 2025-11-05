import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get values from form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // ✅ Hardcoded credentials for now
        if ("admin".equals(username) && "1234".equals(password)) {
            out.println("<h2>Welcome, " + username + "!</h2>");
        } else {
            out.println("<h3>Invalid credentials. Try again!</h3>");
        }

        out.close();
    }
}
