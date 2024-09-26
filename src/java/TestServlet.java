
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//ServletContext and ServletConfig

public class TestServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
//        Servlet Context : Multiple servlet use same parameter
//        ServletContext ctx = getServletContext();
//        String number = ctx.getInitParameter("Number");
        
//        Servlet Config : Parameter for a particular servlet
        ServletConfig cg = getServletConfig();
        String number = cg.getInitParameter("Number");
        
        PrintWriter out = response.getWriter();
        out.println("Test Servlet : " + number);
        
    }
    
}