
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class SecondServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter out = response.getWriter();
        out.print("Second Servlet");
    }
    
}
