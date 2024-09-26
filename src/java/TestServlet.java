
import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//ServletContext and ServletConfig

public class TestServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        ServletConfig cg = getServletConfig();
        String number = cg.getInitParameter("Number");
        
        PrintWriter out = response.getWriter();
        out.println("Test Servlet : " + number);
        
    }
    
}