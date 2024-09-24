
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FirstServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        
//        RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
//        rd.forward(request, response); // might throw servlet exception
        
        response.sendRedirect("SecondServlet");
    }
    
}